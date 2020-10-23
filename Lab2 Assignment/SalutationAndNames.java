/**
 * Problem: A program to store salutation and names .
 * @author Thanusha
 *
 */
public class SalutationAndNames {

	public static void main(String[] args) {
		String names[][]=new String[2][];// creating array of appropriate size.
		names[0]=new String[] {"mr","mrs","miss"};
		names[1]=new String[] {"prateek","maha","aishwarya","rohan","rakesh"};
		for(int i=0;i<names.length;i++) {
			for(int j=0;j<names[i].length;j++)
				if(names[i][j].equals("prateek") || names[i][j].equals("rohan") || names[i][j].equals("rakesh"))// comparing and appending
				          names[i][j]="Mr "+names[i][j];
				else{
					
					if(names[i][j].equals("maha"))
						names[i][j]="Miss "+names[i][j];   
					         else{
						           if(names[i][j].equals("aishwarya"))
						        	   names[i][j]="Mrs "+names[i][j];
					}
				}
		}
		for(int i=0;i<names[1].length;i++)
			System.out.println(names[1][i]);
	}
}
