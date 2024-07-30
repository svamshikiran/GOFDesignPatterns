package com.examples.creational.builder;

public class TestUserBuilder {

	public static void main(String args[]) {
		
		User user1 = new User.UserBuilder("Test", "UserOne")
				.age(30)
				.phone("1234567")
				.address("Hyd address 1234")
				.build();

		System.out.println(user1);
		
		User user2 = new User.UserBuilder("Test", "UserTwo")
				.age(40)
				.phone("5655")
				// no address
				.build();

		System.out.println(user2);

		User user3 = new User.UserBuilder("Test", "UserThree")
				// No age
				// No phone
				// no address
				.build();
		
		System.out.println(user3);
		
		User user4 = new User.UserBuilder("Test", "UserThree")
				.address("TEST ADDRESS")
				.build();

		System.out.println(user4);
	}

}
