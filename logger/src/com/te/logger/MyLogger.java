package com.te.logger;

import java.io.IOException;
import java.util.Formatter;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyLogger {
	
	public static final Logger LOGGER = Logger.getLogger(MyLogger.class.getName());
	
	public static void main(String[] args) throws Exception, IOException {
		
//		ConsoleHandler consoleHandler = new ConsoleHandler();
//		consoleHandler.setLevel(Level.SEVERE);
//		
		//LOGGER.addHandler(consoleHandler);
		FileHandler fileHandler = new FileHandler("C:\\Users\\91774\\Desktop\\logger\\log.log");
		Formatter myFormatter=new MyFormatter();
		//Formatter myFormatter = new MyFormatter();
		fileHandler.setFormatter(myFormatter);
		LOGGER.addHandler(fileHandler);
		
		LOGGER.setLevel(Level.FINE);
		
		LOGGER.finest("I am from the finest");
		LOGGER.finer("I am from the finer");
		LOGGER.fine("I am from the fine");
		LOGGER.config("I am from the config");
		LOGGER.info("I am from the info");//level info
		LOGGER.warning("I am from the warning");
		LOGGER.severe("I am from the severe");
		
		
	}
	
	

}
