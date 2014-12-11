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
		Bookmark bookmark;
		
		LogSingleton.getIstance().println("initializing DB");
		
		account = new Account(0L, "arnaldo", "1234");
		
		bookmark = new Bookmark("http://biblioteca.it/libr1", "capitolo1");
		DBSingleton.getIstance().addBookmark(bookmark);
		account.addBookmark(bookmark);
		
		bookmark = new Bookmark("http://biblioteca.it/libr2", "capitolo2");
		DBSingleton.getIstance().addBookmark(bookmark);
		account.addBookmark(bookmark);

		DBSingleton.getIstance().getAccounts().put(account.getUsername(), account);
		
		
		account = new Account(1L, "giuseppe", "2345");
		
		bookmark = new Bookmark("http://biblioteca.it/libro5", "capitolo5");
		DBSingleton.getIstance().addBookmark(bookmark);
		account.addBookmark(bookmark);
		
		bookmark = new Bookmark("http://biblioteca.it/libr6", "capitolo6");
		DBSingleton.getIstance().addBookmark(bookmark);
		account.addBookmark(bookmark);
		
		DBSingleton.getIstance().getAccounts().put(account.getUsername(), account);
		
    }

}
