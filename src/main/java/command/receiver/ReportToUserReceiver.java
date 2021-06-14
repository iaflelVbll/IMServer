package command.receiver;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Map;

import pojo.Protocol;
import command.BaseReceiver;

public class ReportToUserReceiver extends BaseReceiver {

	public ReportToUserReceiver(Map<String, Socket> connectedUsers,
			Protocol protocol, InputStream in, OutputStream out) {
		super(connectedUsers, protocol, in, out);
	}

	@Override
	public StringBuilder action() throws IOException {
		ObjectOutputStream objOut = new ObjectOutputStream(out);
		objOut.writeObject(protocol);
		return null;
	}

}
