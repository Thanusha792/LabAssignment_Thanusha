/**
 * Problem: A program to print the map with its key as number and value as its square of key.
 * @author Thanusha
 */
import java.util.*;
public class Squares {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] intarray=new int[n];
		int i=0;
		// Accepting the integer Array.
		while(i<n) {
			intarray[i]=sc.nextInt();
			i++;
		}
		Map<Integer,Integer> map=getSquare(intarray);
		// printing the returned map .
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
		    System.out.println(entry.getKey()+" : "+entry.getValue());
		}

	}
	/**
	 * This method accepts array as argument ,calculates square for each element and returns the map which contains square of each element. 
	 * @param arr
	 * @return
	 */
	public static Map<Integer,Integer> getSquare(int arr[]){
		Map<Integer,Integer> m=new HashMap<Integer,Integer>();
	    for(int i=0;i<arr.length;i++) {
	    	int s=arr[i]*arr[i];
	    	m.put(arr[i], s);
	    }
	    return m;
	}
}
