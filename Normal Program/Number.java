package assignment;
import java.util.*;
/*WAJPT read the month number from the user and print name of that 
 * month and corosponding days*/

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a month number:");
		int a = sc.nextInt();
		if(a==1)
			System.out.println("JAN and 31 days");
		else if (a==2)
			System.out.println("FEB and 28 days");
		else if(a==3)
			System.out.println("MAR and 31 days");
		else if(a==4)
			System.out.println("APR and 30 days");
		else if(a==5)
			System.out.println("MAY and 31 days");
		else if(a==6)
			System.out.println("JUN and 30 days");
		else if(a==7)
			System.out.println("JUL and 31 days");
		else if(a==8)
			System.out.println("AUG and 31 days");
		else if(a==9)
			System.out.println("SEPT and 30 days");
		else if(a==10)
			System.out.println("OCT and 31 days");
		else if(a==11)
			System.out.println("NOV and 30 days");
		else if (a==12)
			System.out.println("DEC and 31 days");
		else 
			System.out.println("invalid");
	}

}
