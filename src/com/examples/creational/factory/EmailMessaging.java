package com.examples.creational.factory;

public class EmailMessaging implements Messaging {

	@Override
	public void sendMessage() {
		System.out.println("Sending an Email OTP ");
	}
}

