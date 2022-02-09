package com.hcl.employee;

import com.hcl.concepts.FunctionalInterface;

public class Employee implements FunctionalInterface{
	
	private String name;
	private double salary;
	private int age;
	
	public Employee(String name, double salary, int age) {
		
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	public String tostring() {
		return name +" "+ age + " "+salary;
	}
	@Override
	public int operate(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

}
