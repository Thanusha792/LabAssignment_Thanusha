/**
 * Problem: A Program to create user defined exception based on persons age
 * @author Thanusha
 */
import java.util.Scanner;

public class AgeCheckException extends Exception{// creating user defined exception for age checking

	String str1;
	/**
	 * constructor for agecheckException class
	 * @param str2
	 */
	public AgeCheckException(String str2) {
		str1=str2;
	   }
	/**
	 * Overriding the to string method.
	 */
	   public String toString(){ 
		return ("Exception Occurred: "+str1) ;
	   }
	   public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			// ty block for checking age
			try
			{
				System.out.println("Enter Persons age: ");
				int  age=sc.nextInt();
				if(age<=15)
					throw new FirstAndLastNameCheck("AGE is less than 15 not allowed-----");
				else
					System.out.println("Valid age");
			}
			// catch block for catching exception.
			catch (FirstAndLastNameCheck e) {
				System.out.println(e.toString());
			}
			
		}

}
