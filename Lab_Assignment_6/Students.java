/**
 * Problem : Program to get students who are eligible for three types of medals.
 * @author Thanusha
 */
import java.util.*;

public class Students {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		char choice='n';
		int count=0;
		/**
		 * Accepting students details like registration number and marks , storing in map.
		 */
		do {
			System.out.println("Enter the registration number:");
			int reg_no=sc.nextInt();
			System.out.println("Enter student marks :");
			int marks=sc.nextInt();
			map.put(reg_no,marks);
			System.out.println("Want to continue ?");
			if(sc.next().charAt(0)=='n')
				count=1;
			
		}while(count!=1);
		
		// printing the map which contains students who are eligible for medals.
		Map<Integer,String> student=getStudents(map);
		for (Map.Entry<Integer, String> entry : student.entrySet()) {
		    System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
	}
	/**
	 * This method accepts map which contains registration number and marks of each student.
	 * also returns map which contains student registration number and type of medal which they are eligible to take. 
	 * @param map
	 * @return
	 */
	
	public static Map<Integer,String> getStudents(Map<Integer,Integer> map){
		Map<Integer,String> map1=new HashMap<Integer,String>();
		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			if(entry.getValue()>=90)
				map1.put(entry.getKey(), "Gold");
			if(entry.getValue()>=80 && entry.getValue()<90)
				map1.put(entry.getKey(), "Silver");
			if(entry.getValue()>=70 && entry.getValue()<80 )
				map1.put(entry.getKey(), "Bronze");
		}
		return map1;
	}
}
