package com.masai.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class UserSession {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer sessionId;
	
	@Column(unique = true)
	private String token;
	
	@Column(unique = true)
	private Integer userId;
	
	private String userType;
	
	private LocalDateTime sessionStartTime;
	
	private LocalDateTime sessionEndTime;

	public Integer getSessionId() {
		return sessionId;
	}

	public void setSessionId(Integer sessionId) {
		this.sessionId = sessionId;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public LocalDateTime getSessionStartTime() {
		return sessionStartTime;
	}

	public void setSessionStartTime(LocalDateTime sessionStartTime) {
		this.sessionStartTime = sessionStartTime;
	}

	public LocalDateTime getSessionEndTime() {
		return sessionEndTime;
	}

	public void setSessionEndTime(LocalDateTime sessionEndTime) {
		this.sessionEndTime = sessionEndTime;
	}

	@Override
	public String toString() {
		return "UserSession [sessionId=" + sessionId + ", token=" + token + ", userId=" + userId + ", userType="
				+ userType + ", sessionStartTime=" + sessionStartTime + ", sessionEndTime=" + sessionEndTime + "]";
	}

	public UserSession(Integer sessionId, String token, Integer userId, String userType, LocalDateTime sessionStartTime,
			LocalDateTime sessionEndTime) {
		super();
		this.sessionId = sessionId;
		this.token = token;
		this.userId = userId;
		this.userType = userType;
		this.sessionStartTime = sessionStartTime;
		this.sessionEndTime = sessionEndTime;
	}

	public UserSession() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}