package utility;

import java.util.HashMap;
import java.util.Map;

import model.*;

public class DBSingleton {
	
	private static DBSingleton istance;
	
	private Map<String, Account> accounts;


	public static DBSingleton getIstance(){
		
		if(DBSingleton.istance == null){
			DBSingleton.istance = new DBSingleton();
		}
		
		return DBSingleton.istance;
		
	}
	
	public Map<String, Account> getAccounts(){
		return this.accounts;
	}
	
	private DBSingleton(){
		this.accounts = new HashMap<String, Account>();
	}
	
}
