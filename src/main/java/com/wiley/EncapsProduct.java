package com.wiley;

public class EncapsProduct {


	private int productId;
	
	private String productTitle;
	
	private double productPrice;
	
	public EncapsProduct() {}

	public EncapsProduct(int productId, String productTitle, double productPrice) {
		super();
		this.productId = productId;
		this.productTitle = productTitle;
		this.productPrice = productPrice;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductTitle() {
		return productTitle;
	}

	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productTitle=" + productTitle + ", productPrice=" + productPrice
				+ "]";
	}
	

}
