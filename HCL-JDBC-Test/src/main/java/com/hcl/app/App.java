package com.hcl.app;


import com.hcl.controller.*;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * JPA Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		
		
		// create employee table 		
		DataDefinitionLanguageCommands schemaQuery = new DataDefinitionLanguageCommands();
		
		schemaQuery.createEmployeeSchema();
		
		
		DataQueryLanguageCommands userQuery = new DataQueryLanguageCommands();
		
		System.out.println("\nWelcome to HCL Technologies EMPLOYEE DATABASE");
		System.out.println("---------------------------------------------\n");
		Scanner scan = new Scanner(System.in);
		int input=0;
		do{
			
		    System.out.println("Enter Query Commands : <integer>\n");
		    System.out.println("<1> : insert employee\n");
		    System.out.println("<2> : select all employees\n");
		    System.out.println("<3> : select employee by id\n");
		    System.out.println("<4> : update employee salary by id\n");
		    System.out.println("<5> : delete employee by id\n");
		    System.out.println("<-1> : to end application\n");
		 
		    
		    try{
		    	
		        input = scan.nextInt(); 
		        
		        switch (input) {
		        
				case 1:
					userQuery.insertEmployee(scan);
					break;

				case 2:
					userQuery.selectEmployee();
					break;
							
					
				case 3:
					userQuery.selectEmployee(scan,input);
					break;
					
					
				case 4:
					userQuery.updateEmployee(scan);
					break;
				
					
				case 5:
					userQuery.deleteEmployee(scan,input);
					break;

				default:
					
					break;
				}
		      
		    }catch(InputMismatchException e){
		        
		        System.out.println("Input has to be a number. ");
		    }
		}while(input !=-1); 
		
		   System.out.println("\nDB application ended..");
		
		   
		
		
		   scan.close();

	}
}
