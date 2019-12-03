
package com.cognizant.truyum.Dao;


public class CartEmptyException extends Exception {

	private String message;

	public CartEmptyException(String message) {
		super(message);

		this.message = message;

	}

	
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
