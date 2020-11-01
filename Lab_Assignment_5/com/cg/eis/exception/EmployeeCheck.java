/**
 * To check weather the employee salary is more than 3000 or not.
 * @author Thanusha
 */
package com.cg.eis.exception;
import java.util.*;

public class EmployeeCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee name:");
		String name=sc.nextLine();
		System.out.println("Enter the employee salary:");
		double salary=sc.nextDouble();
		// try block for EmployeeCheck.
		try {
			if(salary<3000)
				throw new EmployeeException("Employee Salary is less than 3000 hence not eligible");
			else
				System.out.println(name+" your eligible");
			
		}
		//catch block to handle the exception cause by try block.
		catch (EmployeeException e) {
			System.out.println(e.toString());
		}
	}
}
