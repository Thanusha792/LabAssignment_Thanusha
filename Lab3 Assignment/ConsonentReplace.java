/**
 * Problem:A Program to replace all the consonents with next letter.
 * @author Thanusha
 *
 */
import java.util.*;

public class ConsonentReplace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String input=sc.nextLine().toLowerCase();
		String output=alterString(input);
		System.out.println(output);
	}
	public static String alterString(String in) {
		String fin="";
		for(int i=0;i<in.length();i++) {
			if(in.charAt(i)=='a' || in.charAt(i)=='e' || in.charAt(i)=='i' || in.charAt(i)=='o' || in.charAt(i)=='u') 
			fin=fin+in.charAt(i);
			else {
				char c=in.charAt(i);
				int a=c;
				int b=a+1;
				c=(char)b;
				fin=fin+c;
			}
		}
		return fin;
	}
}
