/**
 * Problem: Checking wether the number is an increasing number
 * @author Thanusha
 *
 */
import java.util.*;

public class CheckNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=sc.nextInt();
		boolean check=checkNumber(number);
		if(check==true)
			System.out.println(number+" is an increasing number");
		else
			System.out.println(number+" is not an increasing number");
		
	}
	
	public static boolean checkNumber(int n) {
		int count=0;
		while(n>0) {
			int i=n%10;
			n=n/10;
			if(i>=(n%10))
				continue;
			else
				count++;
		}
		if(count==0)
		return true;
		else
			return false;
	}
}
