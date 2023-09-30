package assignment;
import java.util.Scanner;
/*WAJPT read the year from the user and print it is leap year or not*/
public class Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a year:");
		int a = sc.nextInt();
		if (a%4==0 && a%100!=0 || a%400==0){
			System.out.println("this is a leap year");
		}else 
			System.out.println("this is not a leap year ");

	}

}
