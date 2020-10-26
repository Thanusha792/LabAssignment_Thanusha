/**
 * Problem:
 * @author Thanusha
 *
 */
import java.util.*;

public class PositiveString {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String input =sc.nextLine();
		boolean check=getPositiveString(input);
		if(check==true)
			System.out.println("yes");
		else
			System.out.println("No");
	}
	
	public static boolean getPositiveString(String s) {
		int count=0;
		int i=0;
	    boolean ch=false;
		while(i<s.length()-1) {
			if(s.charAt(i)<s.charAt(i+1))
				count++;
			i++;
		}
		if(count==s.length()-1)
			ch=true;
		return ch;
	}
		

}
