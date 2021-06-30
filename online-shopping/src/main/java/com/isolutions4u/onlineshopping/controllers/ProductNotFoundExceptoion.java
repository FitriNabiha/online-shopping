package com.isolutions4u.onlineshopping.controllers;


public class ProductNotFoundExceptoion extends Exception {

	private static final long serialVersionUID = 1L;

	private final String message;

	public ProductNotFoundExceptoion(String message) {
		this.message = System.currentTimeMillis() + " : " + message;
	}

	public ProductNotFoundExceptoion() {
		this("Product Not Available!");
	}

	@Override
	public String getMessage()
	{
		return message;
	}

}
