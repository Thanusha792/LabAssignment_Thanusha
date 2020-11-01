/**
 * problem: A program to validate first and last name and throw exception according to that.
 * @author Thanusha
 */
import java.util.*;
public class FirstAndLastNameCheck extends Exception{

	String str1;
	/**
	 * constructor for FirstAndLastNameCheck class
	 * @param str2
	 */
	public FirstAndLastNameCheck(String str2) {
		str1=str2;
	   }
	   public String toString(){ 
		return ("Exception Occurred: "+str1) ;
	   }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// try block for checking first and last name from input
		try
		{
			System.out.println("Enter the first name: ");
			String firstName=sc.nextLine();
			System.out.println("Enter the last name:");
			String lastName=sc.nextLine();
			if(firstName.isEmpty() || lastName.isEmpty())
				throw new FirstAndLastNameCheck("First or Last name is empty");
			else
				System.out.println(firstName+" "+lastName);
		}
		//catch block for catching exception thrown by class.
		catch (FirstAndLastNameCheck e) {
			System.out.println(e.toString());
		}
		
	}
}
