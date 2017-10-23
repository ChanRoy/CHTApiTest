package com.cht;

import java.util.Date;

/*
 * Object:
 * {"code":" ","msg":" ","time":1464937933230,"object":{}}  
 * 
 * List:
 * {"code":" ","msg":" ","time":1464937933230,"items":[{},{}]}  
 * 
 * */


public class AbstractJsonObject {
	
	// code
	private String code;
	// msg
	private String msg;
	// time
	private Long time = new Date().getTime();
	
	public String getCode() {
		
		return code;
	}	
	public void setCode(String code) {
		
		this.code = code;
	}
	
	public long getTime() {
		
		return time;
	}
	public void setTime(Long time) {
		
		this.time = time;
	}
	
	public String getMsg() {
		
		return msg;
	}
	public void setMsg(String msg) {
		
		this.msg = msg;
	}
	
	public void setContent(String code, String msg) {
		
		this.code = code;
		this.msg = msg;
	}
	
	public void setStatusObject(StatusObject statusObject) {
		
		this.code = statusObject.getCode();
		this.msg = statusObject.getMsg();
	}
}
