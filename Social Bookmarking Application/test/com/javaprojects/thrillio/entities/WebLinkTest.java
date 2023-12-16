package com.javaprojects.thrillio.entities;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.javaproject.thrillio.entities.WebLink;
import com.javaproject.thrillio.managers.BookmarkManager;

class WebLinkTest {

	@Test
	void testIsKidFriendlyEligible() {
		// Test 1:- porn in title return False
		WebLink weblink = BookmarkManager.getInstance().createWebLink(2000,"Taming porn, Part 2"	,"http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html","http://www.javaworld.com","unknown");
		
		boolean isKidFriendlyEligible = weblink.isKidFriendlyEligible();
		
		assertFalse("For porn in title - isKidFriendlyEligible() should return False", isKidFriendlyEligible);
		
		// Test 2:- porn in url return False
		weblink = BookmarkManager.getInstance().createWebLink(2000,"Taming Tiger, Part 2"	,"http://www.javaworld.com/article/2072759/core-java/taming-porn--part-2.html","http://www.javaworld.com", "unknown");
		
		isKidFriendlyEligible  = weblink.isKidFriendlyEligible();
		
		assertFalse("For porn in url - isKidFriendlyEligible() should return False", isKidFriendlyEligible);
		
		
		// Test 3:- adult in host return False
		weblink = BookmarkManager.getInstance().createWebLink(2000,"Taming Tiger, Part 2"	,"http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html","http://www.adultworld.com","unknown");
		
		isKidFriendlyEligible  = weblink.isKidFriendlyEligible();
		
		assertFalse("For adult in host - isKidFriendlyEligible() should return False", isKidFriendlyEligible);
		
		
		// Test 4:- Adult in url but not in host, return True
		weblink = BookmarkManager.getInstance().createWebLink(2000,"Taming Tiger, Part 2"	,"http://www.javaworld.com/article/2072759/core-java/taming-tiger-adult--part-2.html","http://www.javaworld.com","unknown");
		
		isKidFriendlyEligible  = weblink.isKidFriendlyEligible();
		
		assertTrue("For adult in url but not in host - isKidFriendlyEligible() should return True", isKidFriendlyEligible);
		
		// Test 5:- Adult in title only return True
		weblink = BookmarkManager.getInstance().createWebLink(2000,"Taming Adult, Part 2"	,"http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html","http://www.javaworld.com","unknown");
		
		isKidFriendlyEligible  = weblink.isKidFriendlyEligible();
		
		assertTrue("For adult in title - isKidFriendlyEligible() should return True", isKidFriendlyEligible);
		
		
	}

}
