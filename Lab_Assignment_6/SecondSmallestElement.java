/**
 * Problem: A program to to return second smallest element in the list stores array elements as list.
 * @author Thanusha
 */
import java.util.*;

public class SecondSmallestElement {

	public static void main(String[] args) {
		int arr[]= {10,40,20,30,50,70,80,90};
		int selement=getSecondSmallest(arr);//calling method by passing array as an arguement.
		System.out.println(selement);
	}
	
	/**
	 * This method takes array as an arguement and returns int element which is second smallest element.
	 * @param arr1
	 * @return
	 */
	public static int getSecondSmallest(int arr1[]) {
		ArrayList<Integer> t=new ArrayList<Integer>();
		for(int i=0;i<arr1.length;i++) {
			t.add(new Integer(arr1[i]));
		}
		Collections.sort(t);
		int element=t.get(1); //Assigning Second element of a list which is second smallest element of the array and returning it.
		return element;
	}
}
