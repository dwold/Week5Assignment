package com.dagnachew.assignment5;

public class AsteriskLogger implements Logger{

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***\n");
		
	}

	@Override
	public void error(String error) {
		StringBuilder errorBuilder = new StringBuilder();	
		StringBuilder asteriskLine = new StringBuilder();
		
		/*	For making the asterisk line length equal to the 
			second line of the output, we use two for loops: 
			first one is for printing "*" 13 times, which is 
			the number of constant characters, and the second 
			one is for printing as long as the length of the parameter. 
		*/
		for (int i=0; i<13; i++) {
			asteriskLine.append("*");
		}
		for (int i=0; i<error.length(); i++) {			
			asteriskLine.append("*");
		}
		errorBuilder.append(asteriskLine);
		errorBuilder.append("\n***ERROR: " + error + "***\n");
		errorBuilder.append(asteriskLine);
	    System.out.println(errorBuilder.toString());
	    
		
	}

}
