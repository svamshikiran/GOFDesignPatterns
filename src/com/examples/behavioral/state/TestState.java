package com.examples.behavioral.state;

public class TestState {

	public static void main(String[] args) {
		
		Context context = new Context();
		
		State tvStartState = new StartState();
		
		State tvStopState = new StopState();
		
		context.setState(tvStartState);
		context.doAction();
		
		
		context.setState(tvStopState);
		context.doAction();
		
	}
}
