package command.receiver;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Map;

import pojo.Protocol;
import command.BaseReceiver;

public class SendPrivateMsgReceiver extends BaseReceiver {

	public SendPrivateMsgReceiver(Map<String, Socket> connectedUsers,
			Protocol protocol, InputStream in, OutputStream out) {
		super(connectedUsers, protocol, in, out);
	}

	@Override
	public StringBuilder action() throws IOException {
		Socket msgReceiverSocket = connectedUsers.get(protocol.getTo());
		OutputStream msgReceiverOut = msgReceiverSocket.getOutputStream();
		ObjectOutputStream objOut = new ObjectOutputStream(msgReceiverOut);
		objOut.writeObject(protocol);
		return null;
	}

}
