package command;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Map;

import pojo.Protocol;

public abstract class BaseReceiver {
	
	protected Map<String, Socket> connectedUsers;
	protected Protocol protocol;
	protected InputStream in;
	protected OutputStream out;

	public BaseReceiver(Map<String, Socket> connectedUsers, Protocol protocol,
			InputStream in, OutputStream out) {
		super();
		this.connectedUsers = connectedUsers;
		this.protocol = protocol;
		this.in = in;
		this.out = out;
	}

	public abstract StringBuilder action();
}
