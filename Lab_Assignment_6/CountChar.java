/**
 * Problem: Program to count the number of characters repeated in the given array.
 * @author Thanusha
 */
import java.util.*;

public class CountChar {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char[] chararray=new char[n];
		int i=0;
		// Accepting the characters and storing in the array.
		while(i<n) {
			chararray[i]=sc.next().charAt(0);
			i++;
		}

		Map<Character,Integer> map=countChar(chararray);// Calling the 
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
		    System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
	}
	
	/**
	 * accepts character array as an arguement and Counts the frequency of the each character.
	 * also resturns the map with each character with its count number.
	 * @param map
	 * @return
	 */
	public static Map<Character,Integer> countChar(char  map[]){
		Map<Character,Integer> m=new HashMap<Character,Integer>();
		for(int i=0;i<map.length;i++) {
			if(map[i]=='0')
				continue;
			else {
			char t=map[i];
			int count=1;
			for(int j=i+1;j<map.length;j++) {// counting the occurrence of each character.
				if(map[i]==map[j]) {
					map[j]='0';
					count++;
				}
			}
			m.put(map[i], count);
			}
		}
		return m;
	}
    

}
