/**
 * Problem: A program to display number charactors,line and words in a text.
 * @author Thanusha
 *
 */
import java.util.*;
public class Count {
	 
	public static void main(String[] args) {
	   StringBuffer sb=new StringBuffer();
	   Scanner sc=new Scanner(System.in);
	   int lines=0;
	   while (sc.hasNextLine()) {
		   lines++;
           String line = sc.nextLine();
           sb.append(" "+line);
           if (line != null && line.isEmpty()) {
               break;
           }
	}
	   String mstring=sb.toString().trim();
	   int character=0,words=0;
	   for(int i=0;i<mstring.length();i++) {
		   if((mstring.charAt(i)>='a' && mstring.charAt(i)<='z') ||( mstring.charAt(i)>='A' && mstring.charAt(i)<='Z')){
			   character++;
		   }
		   if(mstring.charAt(i)==' ')
			   words++;
	   }
	   System.out.println("Lines= "+(lines-1));
	   System.out.println("Characters= "+character);
	   System.out.println("Words= "+words);
	}

}
