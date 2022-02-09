package com.hcl.concepts;

public interface FunctionalInterface {


	int operate(int a, int b);
	    
	 static int operate(int a, int b, FunctionalInterface fobj)
	    {
	        return fobj.operate(a, b);
	    }
	 
	 
	 default String message() {
	        return "This is my default interface meesage.";
	    }
	 
}
