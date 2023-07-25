package com.examples.behavioral.state;

public class StopState implements State {

	@Override
	public void doAction() {
		System.out.println("TV is turned OFF");
	}

}
