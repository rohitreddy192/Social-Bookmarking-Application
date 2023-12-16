package com.javaproject.thrillio;

import com.javaproject.thrillio.entities.Bookmark;
import com.javaproject.thrillio.entities.User;
import com.javaproject.thrillio.managers.BookmarkManager;
import com.javaproject.thrillio.managers.UserManager;

public class Launch {

	private static User[] users;
	private static Bookmark[][] bookmarks;
	private static void loadData() {
		System.out.println("1. Loading Data..");
		DataStore.loadData();
		
		users = UserManager.getInstance().getUsers();
		bookmarks = BookmarkManager.getInstance().getBookmarks();
		
		//System.out.println("Printing Data...");
		//printUserData();
		//printBookmarkData();
		
	}
	private static void printBookmarkData() {
		for(User user: users) {
			System.out.println(user);
		}
		// TODO Auto-generated method stub
		
	}
	private static void printUserData() {
		for(Bookmark[] bookmarkList: bookmarks) {
			for(Bookmark bookmark: bookmarkList)
				System.out.println(bookmark);
		}
		// TODO Auto-generated method stub
		
	}
	private static void start() {
		//System.out.println("2. Start Bookmarking...");
		for(User user:users) {
			View.browse(user, bookmarks);
		}
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		loadData();
		start();
		// TODO Auto-generated method stub

	}

}
