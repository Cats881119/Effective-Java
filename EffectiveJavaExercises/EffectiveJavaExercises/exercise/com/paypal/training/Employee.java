package com.paypal.training;

import java.util.Date;

public class Employee {
	
	private	String	employeeNumber;
	private	String	firstName;
	private	String	lastName;
	private	Date	dob;
	private	double salary;
	
	public Employee(){
		
	}

	 @Override
	public boolean equals(Object obj) {
		 if(obj==null){
			 return false;
		 }else if(obj==this){
			 return true;
		 }
	     Employee emp=(Employee) obj;
		 
		 return this.employeeNumber.equals(emp.employeeNumber)&&
				 this.firstName.equals(emp.firstName)&&
				 this.lastName.equals(emp.lastName)&&
				 this.dob.equals(emp.dob)&&
				 Double.doubleToLongBits(this.salary)==Double.doubleToLongBits(emp.salary);
		 
	}
	 
	 
	@Override
	public String toString() {
		return "Employee [employeeNumber=" + employeeNumber + ", firstName="
				+ firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result
				+ ((employeeNumber == null) ? 0 : employeeNumber.hashCode());
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}


	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
