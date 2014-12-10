package model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Bookmark {
	
	private Long id;
	private String uri;
	private String description;
	
	@JsonIgnore
	private Account account;

    public Bookmark(Long id, String uri, String description, Account account) {
    	this.id = id;
        this.uri = uri;
        this.description = description;
        this.account = account;
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
