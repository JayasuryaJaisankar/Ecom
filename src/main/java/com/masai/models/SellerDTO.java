package com.masai.models;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;


public class SellerDTO {
	
	
	@NotNull(message="Please enter your mobile Number")
	@Pattern(regexp="[6789]{1}[0-9]{9}", message="Enter a valid Mobile Number")
	private String mobile;
	
	
	@Pattern(regexp="[A-Za-z0-9!@#$%^&*_]{8,15}", message="Please Enter a valid Password")
	private String password;


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "SellerDTO [mobile=" + mobile + ", password=" + password + "]";
	}


	public SellerDTO(
			@NotNull(message = "Please enter your mobile Number") @Pattern(regexp = "[6789]{1}[0-9]{9}", message = "Enter a valid Mobile Number") String mobile,
			@Pattern(regexp = "[A-Za-z0-9!@#$%^&*_]{8,15}", message = "Please Enter a valid Password") String password) {
		super();
		this.mobile = mobile;
		this.password = password;
	}


	public SellerDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}