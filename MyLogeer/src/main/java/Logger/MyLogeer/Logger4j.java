package Logger.MyLogeer;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Logger4j {
	
	static final Logger lOGGER = LogManager.getLogger(Logger4j.class);
	
	public static void main(String[] args) {
		
		lOGGER.fatal("I am from fatal");
		//error warn info debug trace
		
	}

}
