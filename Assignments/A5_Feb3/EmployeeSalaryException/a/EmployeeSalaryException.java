

package a;

import com.cg.eis.exception.EmployeeException;

import java.util.Scanner;

class EmployeeSalaryException{
	public static void main(String[] args) {
		employeeSalary();
	}

	public static void employeeSalary()
	{
		Scanner in = new Scanner(System.in);
		try{
			int salary = in.nextInt();
			if(salary < 3000)
				throw new EmployeeException("Salary is invalid");
		}
		catch(EmployeeException e)
		{
			System.out.println("Salary is lower than the limit ");
			System.out.println(e.getMessage());
		}
	}
}