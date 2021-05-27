package command.receiver;

import java.io.InputStream;
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
	public StringBuilder action() {
		// TODO Auto-generated method stub
		return null;
	}

}
