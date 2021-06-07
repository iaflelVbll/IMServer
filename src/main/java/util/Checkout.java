package util;

import java.net.Socket;
import java.util.Map;

public class Checkout {

	public static boolean checkUser(String userName, Map<String, Socket> onlineUser){
		if(onlineUser != null){
			return onlineUser.containsKey(userName);
		}
		return false;
		
	}

}
