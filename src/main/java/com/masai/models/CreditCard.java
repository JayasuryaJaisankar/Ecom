package com.masai.models;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;


public class CreditCard {
	
	@Pattern(regexp = "[0-9]{16,18}", message = "Invalid card number")
	@NotNull
	private String cardNumber;
	
	@Pattern(regexp = "[0-9]{2}/[0-9]{2,4}", message = "Invalid validity. Enter in MM/YY or MM/YYYY format")
	private String cardValidity;
	
	@Pattern(regexp = "[0-9]{3}", message = "Invalid CVV. Must be numeric 3 digits length.")
	private String cardCVV;

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardValidity() {
		return cardValidity;
	}

	public void setCardValidity(String cardValidity) {
		this.cardValidity = cardValidity;
	}

	public String getCardCVV() {
		return cardCVV;
	}

	public void setCardCVV(String cardCVV) {
		this.cardCVV = cardCVV;
	}

	@Override
	public String toString() {
		return "CreditCard [cardNumber=" + cardNumber + ", cardValidity=" + cardValidity + ", cardCVV=" + cardCVV + "]";
	}

	public CreditCard(@Pattern(regexp = "[0-9]{16,18}", message = "Invalid card number") @NotNull String cardNumber,
			@Pattern(regexp = "[0-9]{2}/[0-9]{2,4}", message = "Invalid validity. Enter in MM/YY or MM/YYYY format") String cardValidity,
			@Pattern(regexp = "[0-9]{3}", message = "Invalid CVV. Must be numeric 3 digits length.") String cardCVV) {
		super();
		this.cardNumber = cardNumber;
		this.cardValidity = cardValidity;
		this.cardCVV = cardCVV;
	}

	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}