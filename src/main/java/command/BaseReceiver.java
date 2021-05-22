package command;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Map;

public abstract class BaseReceiver {
	
	protected Map<String, Socket> connectedUsers;
	protected InputStream in;
	protected OutputStream out;

	public BaseReceiver(Map<String, Socket> connectedUsers, InputStream in,
			OutputStream out) {
		this.connectedUsers = connectedUsers;
		this.in = in;
		this.out = out;
	}

	public abstract StringBuilder action();
}
