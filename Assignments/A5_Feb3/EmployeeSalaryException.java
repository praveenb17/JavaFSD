// Create an Exception class named as “EmployeeException”(User defined Exception) in a
// package named as “com.cg.eis.exception” and throw an exception if salary of an employee is below
// than 3000. Use Exception Handling mechanism to handle exception properly.

package com.cg.eis.exception;
import java.util.Scanner;

class EmployeeException extends Exception{
	EmployeeException(String s)
	{
		super(s);
	}
}

class EmployeeSalaryException{
	public static void main(String[] args) {
		employeeSalary();
	}

	public static void employeeSalary()
	{
		Scanner in = new Scanner(System.in);
		try{
			int salary = in.nextInt();
			if(salary < 30000)
				throw new EmployeeException("<3000");
		}
		catch(EmployeeException e)
		{
			System.out.println("Employee Salary is ");
			System.out.println(e.getMessage());
		}
	}
}