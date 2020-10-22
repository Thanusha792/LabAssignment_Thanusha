/**
 * Problem: checking weather the number is power of two or not.
 * @author Thanusha
 *
 */
import java.util.*;

public class CheckNumberTo {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=in.nextInt();
		boolean check=checkNumber(n);
		if(check==true)
			System.out.println(n+" is a power of 2");
		else
			System.out.println(n+" is not a power of 2");
		
	}
	
	public static boolean checkNumber(int number) {
		int i=2;
		while(i<number) {
			i=i*2;
		}
		if(i==number)
		return true;
		else
			return false;
	}
}
