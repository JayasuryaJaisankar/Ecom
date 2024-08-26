package com.masai.models;


public class SessionDTO {
	
	private String token;
	
	private String message;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "SessionDTO [token=" + token + ", message=" + message + "]";
	}

	public SessionDTO(String token, String message) {
		super();
		this.token = token;
		this.message = message;
	}

	public SessionDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}