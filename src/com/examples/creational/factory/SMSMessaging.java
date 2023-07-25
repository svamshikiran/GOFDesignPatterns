package com.examples.creational.factory;

public class SMSMessaging implements Messaging {

	@Override
	public void sendMessage() {
		System.out.println("Sending an SMS OTP message");
	}
	
}

