package com.dagnachew.assignment5;

public class SpacedLogger implements Logger{

	@Override
	public void log(String log) {
		StringBuilder logBuilder = new StringBuilder();	
		for (int i=0; i<log.length(); i++) {
			logBuilder.append(log.charAt(i) + " ");
		}
		System.out.println("\n" + logBuilder.toString());

	}

	@Override
	public void error(String error) {
		StringBuilder errorBuilder = new StringBuilder();
		for (int i=0; i<error.length(); i++) {
			errorBuilder.append(error.charAt(i) + " ");
		}
		System.out.println("\nERROR: " + errorBuilder.toString());
		
	}

}
