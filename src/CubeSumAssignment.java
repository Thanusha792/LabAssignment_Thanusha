/**
 * Problem: Finding out the sum of cubes of a number.
 * @author Thanusha
 *
 */
import java.util.Scanner;

public class CubeSumAssignment {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=sc.nextInt();
		int sum_result=sumOfCube(number);
		System.out.println(sum_result);
				
	}
	public static int sumOfCube(int num) {
		int rsum=0;
		while(num>0) {
			int i=num%10;
			rsum=rsum+(i*i*i);
			num=num/10;
		}
		return rsum;
	}
}
