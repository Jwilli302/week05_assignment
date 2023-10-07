package Week_5_APP;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Logger logger = new AsteriskLogger();
		
		logger.log("Carmelo"); 
	
		logger.error("Iverson");
		
		Logger loggers = new SpacedLogger();
		
		loggers.log("Sixers".replace("", " "));
		
		loggers.error("Knicks".replace("", " "));
		
	}
	
	

}
