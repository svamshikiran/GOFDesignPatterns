package com.examples.behavioral.memento;

import java.util.Stack;

public class EmpCaretaker {

	final Stack<EmpMemento> mementos = new Stack<>();

	public EmpMemento getMemento() {
		EmpMemento empMemento = mementos.pop();
		return empMemento;
	}

	public void addMemento(EmpMemento memento) {
		mementos.push(memento);
	}

}
