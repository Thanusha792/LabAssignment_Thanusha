/**
 * Problem:printing the command in url.
 * @author Thanusha
 *
 */
import java.util.*;

public class URLCheck {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the url:");
		String s=sc.nextLine();
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();//reversing the string using string buffer.
		s=sb.toString();
		String result="";
		int i=0;
		while(i<s.length()) {
			if(s.charAt(i)=='.') {//checking for the "."
				i=i+1;
				while(s.charAt(i)!='/') {//traversing till we get "/".
					result=result+s.charAt(i);
					i++;
				}
				break;
			}
			i++;
		}
		String fn="";
		for(int k=result.length()-1;k>=0;k--)
			fn=fn+result.charAt(k);
		System.out.println(fn);
		}

}
