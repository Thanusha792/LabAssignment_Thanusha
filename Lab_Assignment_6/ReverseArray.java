/**
 * Problem:A program to reverse the array and print the array in sorted order.
 * @author Thanusha
 */
import java.util.*;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the values");
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int[] result=new int[n];
		result=getSorted(arr);
		for(int i=0;i<n;i++)
			System.out.println(result[i]);
	}
	
	/**
	 * This method returns the reversed and sorted array by accepting int array as a arguement.
	 * @param temp
	 * @return
	 */
	public static int[] getSorted(int[] temp) {
		String str = Arrays.toString(temp);  
        String strArray = str.substring(1, str.length() - 1);
		StringBuffer b=new StringBuffer(strArray);
		b.reverse();
		String string=b.toString().replaceAll("\\s","");
		String[] arr1=string.split(",");
		List<Integer> intarr=new ArrayList<Integer>();
		for(int i=0;i<arr1.length;i++) {
			int j=Integer.parseInt(arr1[i]);
			intarr.add(j);
		}
		Collections.sort(intarr);
		int[] fin=new int[intarr.size()];
		for(int i=0;i<intarr.size();i++)
			fin[i]=intarr.get(i);
		return fin;
	}
}
