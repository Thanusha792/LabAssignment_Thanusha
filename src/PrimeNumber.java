/**
 * Problem: Printing Prime number up to user input number
 * @author Thanusha
 *
 */
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		for(int i=2;i<=n;i++) {
			int primecount=0;
			int k=2;
			while(k<=n) {
				if(i%k==0)
					primecount++;
				k++;
			}
			if(primecount==1)
				System.out.print(i+" ");
		}
	}
}
