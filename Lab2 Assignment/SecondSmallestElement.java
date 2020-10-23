/**
 * Problem: Findind Second smallest element from the given array.
 * @author Thanusha
 *
 */


public class SecondSmallestElement {

	public static void main(String[] args) {
		int arr[]= {10,40,20,30,50,70,80,90};
		int selement=getSecondSmallest(arr);// calling the method by passing arr as arguement and initializing the return value.
		System.out.println(selement);
	}
	
	public static int getSecondSmallest(int arr1[]) {
		for(int i=0;i<arr1.length;i++) { // sorting the array in asceinding order using bubble sort technique.
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[i]>arr1[j]) {
					int t=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=t;
				}
			}
		}
		int element=arr1[1]; //Assigning Second element of the array which is scond smallest element of the array and returning it.
		return element;
	}
}
