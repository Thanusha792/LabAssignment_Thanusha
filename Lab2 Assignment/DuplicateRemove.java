/**
 * Proble: Removing the duplicates and printing the array in reverse order.
 * @author Thanusha
 *
 */
import java.util.*;

public class DuplicateRemove {

	public static void main(String[] args) {
		int arr[]=new int[] {5,8,8,1,3,0,4,3,5,5,10,10,11};
		int result[]=modifyArray(arr);
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] modifyArray(int arr1[]) {
		int count=0;
		for(int i=0;i<arr1.length;i++) {
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[i]==arr1[j]) {
					arr1[j]=-1;
				}
			}
		}
		int r1=0;
		while(r1<arr1.length)
		{
			if(arr1[r1]==-1)
				count++;
			r1++;
		}
		int fin[]=new int[arr1.length-count];
		int r=0;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]==-1)
				continue;
			else {
			fin[r]=arr1[i];
			r++;
			}
		}
		for(int i=0;i<fin.length;i++) { // sorting the array in asceinding order using bubble sort technique.
			for(int j=i+1;j<fin.length;j++) {
				if(fin[i]<fin[j]) {
					int t=fin[i];
					fin[i]=fin[j];
					fin[j]=t;
				}
			}
		}
		return fin;
	}
	
}
