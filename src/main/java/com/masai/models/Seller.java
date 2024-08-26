package com.masai.models;


import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class Seller {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer sellerId;
	
	@NotNull(message="Please enter the first name")
	@Pattern(regexp="[A-Za-z\\s]+", message="First Name should contains alphabets only")
	private String firstName;
	
	@NotNull(message="Please enter the last name")
	@Pattern(regexp="[A-Za-z\\s]+", message="First Name should contains alphabets only")
	private String lastName;
	
   @Pattern(regexp="[A-Za-z0-9!@#$%^&*_]{8,15}", message="Please Enter a valid Password")
	private String password;
	
	@NotNull(message="Please enter your mobile Number")
	@Pattern(regexp="[6789]{1}[0-9]{9}", message="Enter a valid Mobile Number")
	@Column(unique = true)
	private String mobile;
	
	
	@Email
	@Column(unique = true)
	private String emailId;
	

	@OneToMany
	@JsonIgnore
	private List<Product> product;


	public Integer getSellerId() {
		return sellerId;
	}


	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public List<Product> getProduct() {
		return product;
	}


	public void setProduct(List<Product> product) {
		this.product = product;
	}


	@Override
	public String toString() {
		return "Seller [sellerId=" + sellerId + ", firstName=" + firstName + ", lastName=" + lastName + ", password="
				+ password + ", mobile=" + mobile + ", emailId=" + emailId + ", product=" + product + "]";
	}


	public Seller(Integer sellerId,
			@NotNull(message = "Please enter the first name") @Pattern(regexp = "[A-Za-z\\s]+", message = "First Name should contains alphabets only") String firstName,
			@NotNull(message = "Please enter the last name") @Pattern(regexp = "[A-Za-z\\s]+", message = "First Name should contains alphabets only") String lastName,
			@Pattern(regexp = "[A-Za-z0-9!@#$%^&*_]{8,15}", message = "Please Enter a valid Password") String password,
			@NotNull(message = "Please enter your mobile Number") @Pattern(regexp = "[6789]{1}[0-9]{9}", message = "Enter a valid Mobile Number") String mobile,
			@Email String emailId, List<Product> product) {
		super();
		this.sellerId = sellerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.mobile = mobile;
		this.emailId = emailId;
		this.product = product;
	}


	public Seller() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
}