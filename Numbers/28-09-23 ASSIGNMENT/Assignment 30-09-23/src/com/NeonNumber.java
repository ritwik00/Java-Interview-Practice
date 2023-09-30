package com;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		boolean rs = isNeon(n);
		if(rs)
			System.out.println(n+" is a Neon Number.");
		else
			System.out.println(n+" is not a Neon Number.");

	}

	static boolean isNeon(int n) {
		int x=n*n;
		int sum=0;
		do { 
			int r = x%10;
			sum = sum+r;

			x=x/10;
		}while(x!=0);

		return sum==n;
	}
}
