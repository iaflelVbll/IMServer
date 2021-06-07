package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Hashtable;
import java.util.Map;

import thread.SocketThread;

public class Server {
	private Map<String, Socket> onlineUser;
	
	public Server(){
		onlineUser = new Hashtable<String, Socket>();
	}
	
	public void service() throws IOException{
		
		@SuppressWarnings("resource")
		ServerSocket server  =new ServerSocket(8080);
		
		while(true){
			Socket socket = server.accept();
			SocketThread socketThread = new SocketThread(socket, onlineUser);
			new Thread(socketThread).start();
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		new Server().service();
	}

}
