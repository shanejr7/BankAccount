package com.hcl.bank;

/**
 * Software HCL (2/2/2022): Shane Johnson 
 *
 */
public class Bank 
{
    public static void main( String[] args ) throws InsufficientBalanceException
    {
    	
    	// create instance of new bank account user
    	BankCLI account1 = makeNewPrivateAccount();
    	
    	
    	// print user initial account balance
    	System.out.print(account1.toString());
    	
    	// withdraw user account
    	account1.withdraw(1200.33);
    	
    	
    	// print user updated account balance
    	System.out.print(account1.toString());
    	
    	// withdraw user account
    	account1.withdraw(120000.33);
    	
    	
    }
    
    // private method make new account object    
    private static BankCLI makeNewPrivateAccount() {
    	
        return new BankCLI(120000.32, "Sanjay Ramesh");
    }
}
