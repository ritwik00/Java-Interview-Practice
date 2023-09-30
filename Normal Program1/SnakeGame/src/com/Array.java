package com;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many element you want to store");
		int n = sc.nextInt();
		int[] a = new int[n];
		
		System.out.println("Enter the elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int s:a) {
			System.out.println(s);
		}
		

	}

}
