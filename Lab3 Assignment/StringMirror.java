/**
 * problem: A Proram to create mirror image of the input string.
 * @author Thanusha
 *
 */
import java.util.*;
public class StringMirror {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String input=sc.nextLine();
		String result=getImage(input);
		System.out.println(result);
	}
	
	public static String getImage(String s) {
		StringBuffer str=new StringBuffer(s);
		str=str.reverse();
		s=s+"|"+str.toString();
		return s;
	}

}
