/**
 * Problem: Sorting the values in the map and returning the list the call method.
 * @author Thanusha
 */
import java.util.*;

public class SorterdHashMap {

	public static void main(String[] args) {
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		Scanner sc=new Scanner(System.in);
		char choice='n';
		int count=0;
		do {
			System.out.println("Enter the number1 :");
			int number1=sc.nextInt();
			System.out.println("Enter the number2 :");
			int number2=sc.nextInt();
			map.put(number1,number2);
			System.out.println("Want more elements :");
			if(sc.next().charAt(0)=='n')
				count=1;
			
		}while(count!=1);
		
		// creating a list which variable which stores the sorted list.
		List<Integer> final_map=getValues(map);
		 for(Integer list:final_map)  
			  System.out.print(list+" ");  
	}
	/**
	 * Accepts the map as parameter and returns sorted list.
	 * @param map
	 * @return
	 */
	
	public static List<Integer> getValues(HashMap<Integer,Integer> map){
		List<Integer> list=new ArrayList<Integer>();
		Set set2 = map.entrySet();//Creating a entry set which stores the map values.
		Iterator iterator2 = set2.iterator();// creating the iterator.
        while(iterator2.hasNext()) {
             Map.Entry me2 = (Map.Entry)iterator2.next();
             list.add((Integer) me2.getValue());
        }
        Collections.sort(list);
		return list;
	}
}
