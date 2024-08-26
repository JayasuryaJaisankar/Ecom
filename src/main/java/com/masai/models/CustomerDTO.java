package com.masai.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;


public class CustomerDTO {
	
	@NotNull
	@Pattern(regexp = "[6789][0-9]{9}", message = "Enter valid mobile number")
	private String mobileId;
	
	@NotNull(message = "Please enter the password")
	@Pattern(regexp = "[A-Za-z0-9!@#$%^&*_]{8,15}", message = "Password must be 8-15 characters in length and can include A-Z, a-z, 0-9, or special characters !@#$%^&*_")
	private String password;
	
	@Email
	private String emailId;

	public String getMobileId() {
		return mobileId;
	}

	public void setMobileId(String mobileId) {
		this.mobileId = mobileId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "CustomerDTO [mobileId=" + mobileId + ", password=" + password + ", emailId=" + emailId + "]";
	}

	public CustomerDTO(
			@NotNull @Pattern(regexp = "[6789][0-9]{9}", message = "Enter valid mobile number") String mobileId,
			@NotNull(message = "Please enter the password") @Pattern(regexp = "[A-Za-z0-9!@#$%^&*_]{8,15}", message = "Password must be 8-15 characters in length and can include A-Z, a-z, 0-9, or special characters !@#$%^&*_") String password,
			@Email String emailId) {
		super();
		this.mobileId = mobileId;
		this.password = password;
		this.emailId = emailId;
	}

	public CustomerDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}