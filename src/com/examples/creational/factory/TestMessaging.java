package com.examples.creational.factory;

public class TestMessaging {

	public static void main(String args[]) {
		
		Messaging msgObj =  MessagingFactory.createNotification("SMS");
		
		msgObj.sendMessage();
		
		msgObj = MessagingFactory.createNotification("EMAIL");
		
		msgObj.sendMessage();
		
		msgObj = MessagingFactory.createNotification("PUSH");
		
		msgObj.sendMessage();
		

	}
}
