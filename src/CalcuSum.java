/**
 * Problem: Calculating sum of first n natural numbers which are divisible by 3 and 5.
 * @author Thanusha
 *
 */
import java.util.*;

public class CalcuSum {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=ip.nextInt();
		int s=calculateSum(n);
		System.out.println(s);
	}
	
	public static int calculateSum(int number) {
		int sum=0;
		while(number>0) {
			if(number%3==0 || number%5==0)
				sum=sum+number;
			number--;
		}
		return sum;
	}
}