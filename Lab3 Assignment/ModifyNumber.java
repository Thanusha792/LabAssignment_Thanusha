/**
 * Problem: Program to modify the input number.
 * @author Thanusha
 *
 */
import java.util.*;

public class ModifyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int result=modifyNumber(number);
		System.out.println(result);
	}
    
	public static int modifyNumber(int num) {
		String t=Integer.toString(num);
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<t.length()-1;i++) {
			int a=Character.getNumericValue(t.charAt(i));
			int b=Character.getNumericValue(t.charAt(i+1));
			int dif=Math.abs(a-b);
			sb.append(dif);
		}
		sb.append(t.charAt(t.length()-1));
		String fin=sb.toString();
		int rfin=Integer.parseInt(fin);
		return rfin;
	}
}
