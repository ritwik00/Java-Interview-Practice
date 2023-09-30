package assignment;
import java.util.Scanner;
/*WAJPT read3 distinct int value from the user and print the mid value*/

public class Mid {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 distinct value:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int mid = (a>b&&b>c)?b:((a>c)?a:c);
		System.out.println("the mid value is "+mid);
	}

}
