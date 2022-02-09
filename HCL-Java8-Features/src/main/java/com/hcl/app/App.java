package com.hcl.app;

import com.hcl.employee.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.hcl.concepts.FunctionalInterface;
/**
 * 2.Implement a Java program with Stream API and without the Stream API, 
 * consider filter condition as for example you had
 *  employee list filter the employee records whose 
 *  salary >1000 $ ,Name Startes with B & D and age > 30 .
 *
 */
public class App
{
	
    public static void main( String[] args )
    {
    	// Instantiate array list employee
    	
       ArrayList<Employee> e = new ArrayList<Employee>();
       
       e.add(new Employee("Jim",50000.00,24));
       e.add(new Employee("Alez",30000.00,22));
       e.add(new Employee("Ben",60000.00,25));
       e.add(new Employee("Kerry",50000.00,20));
       e.add(new Employee("Jasmine",50000.00,21));
       e.add(new Employee("Ben",20000.00,31));
       
       
       	
       // Lambda expressions
       System.out.println("Lambda expressions: employee age > 30 ");
       
       e.forEach(n -> { if (n.getAge()>30) System.out.println(n.tostring()); });
      
       System.out.println();
       
       // Method references
       // Default methods
       System.out.println("Method references:");
       System.out.println(e.get(0).message());
       System.out.println();
       
       // Functional interfaces      
       // Add two numbers using lambda expression
       // Static methods in interface
      System.out.println("Functional interfaces: add two numbers");
      
      FunctionalInterface add = (int x, int y) -> x + y;
      
      System.out.println("Addition is " +
              FunctionalInterface.operate(6, 3, add));
      
      System.out.println();
   
       
   
       // Stream API,Parallel Stream
       System.out.println("Stream: employees list added to stream");
       Collection<Object> collection = Arrays.asList(e.toArray());
       Stream<Object> streamObj = collection.stream();
       System.out.println(streamObj.count());
       System.out.println();
       

       // Optional class
       System.out.println("Optional class: integer value: 1");
       Optional<Integer> a = Optional.ofNullable(1);
       System.out.println(a.isEmpty());
       System.out.println();
       
       // Collectors class
       System.out.println("Collectors class: salary > 20000");
       System.out.println(e.stream()
               .filter(emoployee -> emoployee.getSalary() > 20000)
               .map(n -> n.getName())
               .collect(Collectors.toList()));
       System.out.println();
       
       // ForEach() method
       System.out.println("ForEach() method:");
       e.forEach(n -> System.out.println(n.tostring()));
       System.out.println();
       
       // Predicate
       System.out.println("Predicate:");
       Predicate<Integer> lessThan = i -> (i < 30); 
       
       System.out.println(lessThan.test(10));
       System.out.println();
       
       // BiFunction examples
       System.out.println("BiFunction examples:");
       // takes two Integers and return an Integer
       BiFunction<Integer, Integer, Integer> func = (o1, o2) -> o1 + o2;

       Integer result = func.apply(25, 10);

       System.out.println(result);
    
       
    }


}
