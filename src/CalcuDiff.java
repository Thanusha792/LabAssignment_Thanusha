/**
 * Problem: Calculting difference between sum of squares and square of sum.
 * @author Thanusha
 *
 */
import java.util.*;

public class CalcuDiff {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sum=calculateDifference(n);
		System.out.println(sum);
	}
	 
	public static int calculateDifference(int number) {
		int s=0;
		int sqaure_sum=0,sum_sqaure=0;
		while(number>0) {
			sqaure_sum=sqaure_sum+(number*number);
			sum_sqaure=sum_sqaure+number;
			number--;
		}
		s=(sum_sqaure*sum_sqaure)-sqaure_sum;
		return s;
	}
}
