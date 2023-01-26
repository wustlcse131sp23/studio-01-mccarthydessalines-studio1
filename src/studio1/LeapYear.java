package studio1;
import java.util.Scanner;

public class LeapYear 
{
	public static void main(String []args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println(" Enter a year and we will tell if you if it's a leap year");
		int n= in.nextInt();
		boolean leapYear =(((n%4)==0)&&((n%100)!=0))||((n%400)==0);
		// boolean leapYear2 = (n%4=0&&(n%4)00=0)||(n%100=0);
		
		
		System.out.println( "This is "+leapYear);
	}
}
