package com;

import java.util.Scanner;
//Ritwik Biswas

public class PrimeDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int s = prime(n);
		System.out.println("The count of prime digit of that num "+s);

	}

	static int prime(int n) {
		int count=0,sum=0,d;
		do{
			d=n%10;

			if(d==3||d==5||d==7)
				count++;

			n=n/10;
		}
		while(n!=0);
		return count;
	}
}


