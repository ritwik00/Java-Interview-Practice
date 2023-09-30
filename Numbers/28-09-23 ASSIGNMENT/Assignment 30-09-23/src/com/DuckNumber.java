package com;

import java.util.Scanner;

public class DuckNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		boolean rs = isDuck(n);
		if(rs==true)
			System.out.println(n+" is a Duck Number.");
		else
			System.out.println(n+" is not a Duck Number.");

	}

	static boolean isDuck(int n) {
			do {
				int r = n%10;
				if(r==0)
					return true;
				n=n/10;
			}while(n!=0);

		return false;
	}
}



