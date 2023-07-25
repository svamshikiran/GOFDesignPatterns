package com.examples.creational.factory;

public class PushNotificationMessaging  implements Messaging {

	@Override
	public void sendMessage() {
		System.out.println("Sending an PushNotification OTP ");
	}
}

