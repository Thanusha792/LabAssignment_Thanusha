/**
 * Problem: Creating fibonacci without recursion.
 * @author Thanusha
 *
 */
import java.util.Scanner;

public class Fibonacci1 {
	public static void main(String[] args) {
		System.out.println("Enter the Limit : ");
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		int s1=0,s2=1;
		  System.out.print(s1+" "+s2+" ");
		  int i=0;
		  while(i<n){
			  int c=s1+s2;
		    System.out.print(c+" ");
			s1=s2;
			s2=c;
			i++;
	}
}
}
