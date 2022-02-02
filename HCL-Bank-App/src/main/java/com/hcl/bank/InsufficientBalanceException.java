package com.hcl.bank;

public class InsufficientBalanceException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientBalanceException() {
		
		super();
		
	}
	
	public String toString() {
		return "insufficient balance could not withdraw";
	}

}
