package com.intersystems.demo.pex;

public class Request extends com.intersystems.enslib.pex.Message {
	
	public String requestString = null;

	public String message = "toto";

	public Integer requesInteger = 0;
	
	public Request(String initStringValue) {
		requestString = initStringValue;
	}
	
}
