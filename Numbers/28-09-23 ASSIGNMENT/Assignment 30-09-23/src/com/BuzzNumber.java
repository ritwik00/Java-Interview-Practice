package com;

import java.util.Scanner;

public class BuzzNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		boolean rs = isBuzz(n);
		if(rs==true)
			System.out.println(n+" is a Buzz Number.");
		else
			System.out.println(n+" is not a Buzz Number.");

	}

	static boolean isBuzz(int n) {
		if(n%7==0||n%10==7) {
			return true;
		}

			return false;
	}

}


