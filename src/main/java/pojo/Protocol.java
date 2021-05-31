package pojo;

import java.util.Date;
import java.util.List;

public class Protocol {
	public final static int LOGIN = 1;
	public final static int LOGOUT = 2;
	public final static int PRIVATE_MSG = 3;
	public final static int GROUP_MSG = 4;
	public final static int PRIVATE_SHAKE = 5;
	public final static int GROUP_SHAKE = 6;
	public final static int ERROR = 7;
	public final static int LOGIN_SUCCEED = 8;
	public final static int SOMEONE_LOGIN = 9;
	public final static int SOMEONE_LOGOUT = 10;
	
	private int type;
	private String msg;
	private String from;
	private String to;
	private List<String> onlineList;
	private Date time;
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public List<String> getOnlineList() {
		return onlineList;
	}
	public void setOnlineList(List<String> onlineList) {
		this.onlineList = onlineList;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
}
