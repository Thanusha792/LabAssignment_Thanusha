/**
 * Problem: Creating fibonacci serious using recursion.
 * @author Thanusha
 *
 */
import java.util.Scanner;

public class Fibonacci2 {
	public static void main(String[] args) {
		System.out.println("Enter the Limit : ");
	Scanner ip=new Scanner(System.in);
	int n=ip.nextInt();
	int a=0,b=1;
	System.out.print(a+" "+b+" ");
	fibo(a,b,n);
	}
	
	public static int fibo(int a1,int b1,int number) {
		if(number<=2)
			return 1;
		else {
			int c=a1+b1;
			a1=b1;
			b1=c;
			System.out.print(c+" ");
			number--;		
			return fibo(a1,b1,number);
		}
	}
}
