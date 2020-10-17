package com.dagnachew.assignment5;

public class App {

	public static void main(String[] args) {
		
		Logger asteriskLog = new AsteriskLogger();
		Logger asteriskError = new AsteriskLogger();
		Logger spacedLog = new SpacedLogger();
		Logger spacedError = new SpacedLogger();
		asteriskLog.log("404 File Not Found!");
		asteriskError.error("404 File Not Found!");
		spacedLog.log("404 File Not Found!");
		spacedError.error("404 File Not Found!");	

	}

}
