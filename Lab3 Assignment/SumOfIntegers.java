/**
 * Problem: A program which reads line of integer and displays each integer and sum of all integers.
 * @author Thanusha
 *
 */
import java.util.*;

public class SumOfIntegers {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the serious of integer:");
		String number=sc.nextLine();
		StringTokenizer st=new StringTokenizer(number," ");// String tokenizer for stroring strings charactors in serious.
		int sum=0;
		while (st.hasMoreElements()) {  
			 String i=st.nextToken().toString();// checking and converting each token to integer.
	         System.out.println(i);  
	         sum=sum+Integer.parseInt(i);
	     } 
		System.out.println(sum); 
	}

}
