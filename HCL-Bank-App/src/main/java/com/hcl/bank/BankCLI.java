// Software HCL (2/2/2022): Shane Johnson 

package com.hcl.bank;

public class BankCLI {
	
    // INSTANCE VARIABLES
    private double balance;
    private String owner;
    
    
    // OVERLOADED CONSTRUCTOR METHODS
    public BankCLI() {
        balance = 0.0;
        owner = "not assigned";
    }
    // NORMAL CONSTRUCTOR
    public BankCLI(double balance, String owner) {
        this.balance = balance;
        this.owner = owner;
    }
    // LAMBDA CONSTRUCTOR
    public BankCLI(String startBalance, String owner) {
        this(Double.parseDouble(startBalance), owner);
    }
    // EXISTING OBJECT CONSTRUCTOR
    public BankCLI(BankCLI acc) {
        balance = acc.getBalance();
        owner = acc.getOwner();
    }
    
    
    // SETTER METHODS
    public void setBalance(double balance) { this.balance = balance; }
    public void setBalance(String balance) {this.balance = Double.parseDouble(balance);}
    public void setOwner (String owner) { this.owner = owner; }
    
    // GETTER METHODS
    public double getBalance() { return balance; }
    public String getOwner()   { return owner;   }
    
    
    // CORE METHODS
    
    // DEPOSIT OVERLOADED METHODS
    public void deposit(double amount) {
        balance += amount;
        System.out.printf("\tOK, deposited $%.2f\n", amount);
    }
    public void deposit(String amount) {
        deposit(Double.parseDouble(amount));
    }
    
    // WITHDRAW OVERLOADED METHODS
    public void withdraw(double amount) throws InsufficientBalanceException {
    	
    	if(balance < amount) {
    		throw new InsufficientBalanceException();
    	}else {
    		
        balance -= amount;
        System.out.printf("\tOK, withdrew $%.2f\n", amount);
        
    	}
       
    }
    public void withdraw(String amount) throws InsufficientBalanceException {
    	
    	if(balance < Double.parseDouble(amount)) {
    		throw new InsufficientBalanceException();
    	}else {
    		
        withdraw(Double.parseDouble(amount));
        
    	}
    }

    // toString
    public String toString() {
        return String.format("%s's balance is $%,.2f\n", owner, balance); 
    }


}
