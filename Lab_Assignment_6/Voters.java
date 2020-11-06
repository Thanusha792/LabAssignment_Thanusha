/**
 * Problem: Program to get voter list who are eligible.
 * @author Thanusha
 */
import java.util.*;

public class Voters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Map<Integer,Integer> vote=new HashMap<Integer,Integer>();
		char choice='n';
		int count=0;
		do {
			System.out.println("Enter the id : ");
			int id=sc.nextInt();
			System.out.println("Enter the age");
			int age=sc.nextInt();
			vote.put(id, age);
			System.out.println("Want to continue ?");
			if(sc.next().charAt(0)=='n')
				count=1;
			}while(count!=1);
		List<Integer> voter=votersList(vote);
		System.out.println("Eligible voters are :");
		for(int i=0;i<voter.size();i++)
			System.out.println(voter.get(i));
	}
	
	public static List<Integer> votersList(Map<Integer,Integer> map){
			List<Integer> voterslist=new ArrayList<Integer>();
			for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			    if(entry.getValue()>18)
			    	voterslist.add(entry.getKey());
			}
			return voterslist;
		}
}