package com.masai.models;


public class ProductDTO {
	
	private String prodName;
	private String manufaturer;
	private Double price;
	private Integer quantity;
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getManufaturer() {
		return manufaturer;
	}
	public void setManufaturer(String manufaturer) {
		this.manufaturer = manufaturer;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "ProductDTO [prodName=" + prodName + ", manufaturer=" + manufaturer + ", price=" + price + ", quantity="
				+ quantity + "]";
	}
	public ProductDTO(String prodName, String manufaturer, Double price, Integer quantity) {
		super();
		this.prodName = prodName;
		this.manufaturer = manufaturer;
		this.price = price;
		this.quantity = quantity;
	}
	public ProductDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}