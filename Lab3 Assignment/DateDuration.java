/**
 * Problem: A program to calculate duration of the given data from current time.
 * @author Thanusha
 *
 */
import java.util.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter; 
import java.time.Period; 


public class DateDuration {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the time in 'YYYY/MM/DD' format: ");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
		   LocalDate now = LocalDate.now();    
		   String s=sc.nextLine();
		   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		   LocalDate after = LocalDate.parse(s, formatter);
		   String[] result=getDuration(now,after);
		   System.out.println(result[0]);
	       System.out.println(result[1]);
	       System.out.println(result[2]);
	}       
	
	
	public static String[] getDuration(LocalDate one, LocalDate two) {
		Period period = Period.between(one,two);
        String[] re=new String[3];
        re[0]=period.getYears() + " years";
        re[1]=period.getMonths() + " months";
        re[2]=period.getDays() + " days";
        return re;
    }
	

}
