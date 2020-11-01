/**
 * Craeting user defined exception class for employee salary check.
 * @author Thanusha
 */
package com.cg.eis.exception;

public class EmployeeException extends Exception{
	String message;
	
	public EmployeeException(String message) {
	this.message=message;
	}
	public String toString() {
		return message;
	}

}
