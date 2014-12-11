package model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Bookmark {
	
	private Long id;
	private String uri;
	private String description;
	
	@JsonIgnore
	private Account account;

	private Bookmark() {}
	
    public Bookmark(String uri, String description) {
    	this.id = null;
        this.uri = uri;
        this.description = description;
        this.account = null;
    }
    
    public void setAccount(Account account){
    	this.account = account;
    }
    
    public void setId(Long id){
    	this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getUri() {
        return uri;
    }

    public String getDescription() {
        return description;
    }

	public Account getAccount() {
		return account;
	}
}
