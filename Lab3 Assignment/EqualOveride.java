/**
 * Problem: A java program to override equal method using employee class. 
 * @author Thanusha
 *
 */
import java.util.*;

public class EqualOveride {
    private String employeeName;
    private int employeeId;
    EqualOveride(int employeeId,String employeeName){
    	this.employeeId=employeeId;
    	this.employeeName=employeeName;
    }
    EqualOveride(int employeeId){
    	this.employeeId=employeeId;
    }
    EqualOveride(String employeeName){
    	this.employeeName=employeeName;
    }
    
	public static void main(String[] args) {
		EqualOveride eq=new EqualOveride(101,"Thanusha");
		EqualOveride eq1=new EqualOveride(102);
		EqualOveride eq2=new EqualOveride("Thanu");
		EqualOveride eq3=new EqualOveride(101, "Thanusha");
		if(eq.equals(eq3))
			System.out.println("The two objects eq and eq3 are equal");
		else
			System.out.println("Not equal");
		if(eq.equals(eq1))
			System.out.println("The two objects eq and eq1 are equal");
		else
			System.out.println("Not equal");
		if(eq.equals(eq2))
			System.out.println("The two objects eq and eq2 are equal");
		else
			System.out.println("Not equal");
	}
	public boolean equals(Object o) {
		EqualOveride t=(EqualOveride)o;
		return employeeName.equals(t.employeeName) && Integer.compare(employeeId, t.employeeId)==0;
	}
}
