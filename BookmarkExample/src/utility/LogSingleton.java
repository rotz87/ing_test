package utility;

public class LogSingleton {
	
	private static LogSingleton istance;

	public void println(String text){
		System.out.println("Log: "+text);
	}
	
	public static LogSingleton getIstance(){
		
		if(LogSingleton.istance == null){
			LogSingleton.istance = new LogSingleton();
		}
		
		return LogSingleton.istance;
		
	}
	
	private LogSingleton(){
		
	}
	
}
