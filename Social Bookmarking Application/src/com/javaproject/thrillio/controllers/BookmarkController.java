package com.javaproject.thrillio.controllers;

import com.javaproject.thrillio.entities.Bookmark;
import com.javaproject.thrillio.entities.User;
import com.javaproject.thrillio.managers.BookmarkManager;

public class BookmarkController {
	private static BookmarkController instance = new BookmarkController();
	
	private BookmarkController() {}
	
	public static BookmarkController getInstance() {
		return instance;
	}

	public void saveUserBookmark(User user, Bookmark bookmark) {
		BookmarkManager.getInstance().saveUserBookmark(user,bookmark);
		
	}
}
