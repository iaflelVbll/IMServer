package command.impl;

import java.io.IOException;

import command.BaseReceiver;
import command.Command;

public class ConcreteCommand implements Command {

	private BaseReceiver receiver;

	public ConcreteCommand(BaseReceiver receiver) {
		this.receiver = receiver;
	}

	public StringBuilder execute() throws IOException {
		return receiver.action();
	}
	
}
