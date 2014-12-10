package utility;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;

import model.*;

import org.springframework.stereotype.Component;


@Singleton 
@Component
public class StartUp {
	
	@PostConstruct
    public void start() {
		
		Account account;
		
		LogSingleton.getIstance().println("initializing DB");
		System.out.println("aaa");
		
		account = new Account(0L, "arnaldo", "1234");
		account.addBookmark(new Bookmark(0L, "http://biblioteca.it/libro0", "capitolo0", account));
		account.addBookmark(new Bookmark(1L, "http://biblioteca.it/libr1", "capitolo1", account));
		
		DBSingleton.getIstance().getAccounts().put(account.getUsername(), account);
		
		account = new Account(1L, "giuseppe", "2345");
		account.addBookmark(new Bookmark(2L, "http://biblioteca.it/libro5", "capitolo5", account));
		account.addBookmark(new Bookmark(3L, "http://biblioteca.it/libr6", "capitolo6", account));
		
		DBSingleton.getIstance().getAccounts().put(account.getUsername(), account);
		
    }

}
