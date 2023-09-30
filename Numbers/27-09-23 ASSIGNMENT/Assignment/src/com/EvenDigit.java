package com;

import java.util.Scanner;
//Ritwik Biswas

public class EvenDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int s = even(n);
		System.out.println("The count of even digit of that num "+s);

	}

	static int even(int n) {
		int count=0,sum=0,d;
		do{
			d=n%10;
			
				if(d%2==0)
					count++;
			
			n=n/10;
		}
		while(n!=0);
		return count;
	}

}


