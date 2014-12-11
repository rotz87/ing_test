package utility;

import java.util.HashMap;
import java.util.Map;

import model.*;

public class DBSingleton {
	
	private static DBSingleton istance;
	
	private Map<String, Account> accounts;
	
	private Map<Long, Bookmark> bookmarks;


	public static DBSingleton getIstance(){
		
		if(DBSingleton.istance == null){
			DBSingleton.istance = new DBSingleton();
		}
		
		return DBSingleton.istance;
		
	}
	
	public Map<String, Account> getAccounts(){
		return this.accounts;
	}
	
	public void addBookmark(Bookmark bookmark){
		Long id;
		
		id = (long)this.bookmarks.size();
		bookmark.setId(id);
		this.bookmarks.put(id, bookmark);
	}
	
	private DBSingleton(){
		this.accounts = new HashMap<String, Account>();
		this.bookmarks = new HashMap<Long, Bookmark>();
	}
	
}
