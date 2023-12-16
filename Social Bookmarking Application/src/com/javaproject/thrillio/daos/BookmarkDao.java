package com.javaproject.thrillio.daos;

import com.javaproject.thrillio.DataStore;
import com.javaproject.thrillio.entities.Bookmark;
import com.javaproject.thrillio.entities.UserBookmark;

public class BookmarkDao {

	public Bookmark[][] getBookmarks(){
		return DataStore.getBookmarks();
	}

	public void saveUserBookmark(UserBookmark userBookmark) {
		DataStore.add(userBookmark);
		
	}
}
