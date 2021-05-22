package command.receiver;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Map;

import command.BaseReceiver;

public class LogoutReceiver extends BaseReceiver {

	public LogoutReceiver(Map<String, Socket> connectedUsers,
			InputStream in, OutputStream out) {
		super(connectedUsers, in, out);
	}

	@Override
	public StringBuilder action() {
		// TODO Auto-generated method stub
		return null;
	}

}
