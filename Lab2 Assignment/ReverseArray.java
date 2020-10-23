/**
 * Problem: To accept integer array and reverse the array and sort it.
 * @author Thanusha
 *
 */
import java.util.*;

public class ReverseArray {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the limit");
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	int result[]=getSorted(arr);// calling the method.
	System.out.println(Arrays.toString(result));
	}
	
	public static int[] getSorted(int arr1[]) {
		String temp=Arrays.toString(arr1).replaceAll("\\s",""); // converting the interger array to string by replacing \\s
		temp=temp.substring(1,temp.length()-1);// discarding "[,]" at atsrt and end using substring.
		StringBuilder sb=new StringBuilder(temp);
        sb.reverse(); // reversing the array
        temp=sb.toString();
        String s1[]=temp.split(","); // creating string array by using split method.
        int fina[]=new int[s1.length];
        for(int i=0;i<s1.length;i++)
        	fina[i]=Integer.parseInt(s1[i]);// converting string to integer using parseint.
        for(int i=0;i<fina.length;i++) { // sorting the array in asceinding order using bubble sort technique.
			for(int j=i+1;j<fina.length;j++) {
				if(fina[i]>fina[j]) {
					int t=fina[i];
					fina[i]=fina[j];
					fina[j]=t;
				}
			}
		}
        return fina;
	}
}
