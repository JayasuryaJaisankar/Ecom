package com.masai.models;

import jakarta.persistence.Embedded;
import jakarta.validation.constraints.NotNull;

import org.hibernate.validator.constraints.CreditCardNumber;


public class OrderDTO {
	
	@NotNull
	@Embedded
	private CreditCard cardNumber;
	@NotNull
	private String addressType;
	public CreditCard getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(CreditCard cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	@Override
	public String toString() {
		return "OrderDTO [cardNumber=" + cardNumber + ", addressType=" + addressType + "]";
	}
	public OrderDTO(@NotNull CreditCard cardNumber, @NotNull String addressType) {
		super();
		this.cardNumber = cardNumber;
		this.addressType = addressType;
	}
	public OrderDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}