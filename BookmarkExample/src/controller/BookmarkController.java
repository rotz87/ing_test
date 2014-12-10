package controller;

import org.springframework.hateoas.ResourceSupport;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import utility.*;
import model.*;
import resourcemodel.*;

@RestController
@RequestMapping("/{username}/bookmarks")
public class BookmarkController {
	
	@RequestMapping(value = "/{bookmarkId}", method = RequestMethod.GET)
	public BookmarkResource readBookmark(@PathVariable String username, @PathVariable Long bookmarkId) {
		
		DBSingleton db;
		Account account;
		Bookmark bookmark;
		
		account = null;
		bookmark = null;
		
		db = DBSingleton.getIstance();
		account = db.getAccounts().get(username);
		if (account != null){
			bookmark = account.getBookmarks().get(bookmarkId);
		}
		
		//return null;
		return new BookmarkResource(bookmark);
		
	}
	
}