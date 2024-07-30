package com.examples.behavioral.state;

public class StartState  implements State {

	@Override
	public void doAction() {
		System.out.println("TV is turned OFF");
	}

}
