package thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Map;

import pojo.Protocol;
import util.Checkout;

public class SocketThread implements Runnable{
	
	private Map<String, Socket> onlineUser;
	private Socket socket;
	
	public SocketThread(Socket socket, Map<String, Socket> onlineUser){
		this.socket = socket;
		this.onlineUser = onlineUser;
	}

	public void run() {
		try {
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
		
			ObjectInputStream objectIn = new ObjectInputStream(in);
			Protocol protocol = (Protocol) objectIn.readObject();
			String userName = protocol.getFrom();
			boolean isExist = Checkout.checkUser(userName, onlineUser);
			if(isExist){
				//return error
			}else{
				//return online onlineuser
				while(true){
					//read ... write
				}
			}
		
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
