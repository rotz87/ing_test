package model;

import java.util.HashMap;
import java.util.Map;

public class Account {

	private Long id;
	private String password;
	private String username;
	private Map<Long, Bookmark> bookmarks;//<bookmark.id, bookmark>
    
    public Account(Long id, String name, String password) {
    	this.id = id;
        this.username = name;
        this.password = password;
        this.bookmarks = new HashMap<Long, Bookmark>();
    }
    
    public void addBookmark(Bookmark bookmark){
    	bookmark.setAccount(this);
    	this.bookmarks.put(bookmark.getId(), bookmark);
    }
    
    public Map<Long, Bookmark> getBookmarks() {
        return bookmarks;
    }

    public Long getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
	
}
