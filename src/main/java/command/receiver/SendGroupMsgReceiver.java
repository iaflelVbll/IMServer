package command.receiver;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Map;
import java.util.Map.Entry;

import pojo.Protocol;
import command.BaseReceiver;

public class SendGroupMsgReceiver extends BaseReceiver {

	public SendGroupMsgReceiver(Map<String, Socket> connectedUsers,
			Protocol protocol, InputStream in, OutputStream out) {
		super(connectedUsers, protocol, in, out);
	}

	@Override
	public StringBuilder action() throws IOException {
		
		for (Entry<String, Socket> e : connectedUsers.entrySet()) {
			
			// Skip sender himself
			if (e.getKey().equals(protocol.getFrom())) {
				continue;
			}
			
			Socket msgReceiverSocket = e.getValue();
			OutputStream msgReceiverOut = msgReceiverSocket.getOutputStream();
			ObjectOutputStream objOut = new ObjectOutputStream(msgReceiverOut);
			objOut.writeObject(protocol);
		}
		return null;
	}

}
