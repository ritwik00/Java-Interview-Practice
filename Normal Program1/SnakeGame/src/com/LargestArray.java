package com;

import java.util.Scanner;

public class LargestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many elements do you want to store");
		//Taking input from the user
		int n = sc.nextInt();
		//Declaring the size 
		int[] a= new int[n];
		//Taking the array input
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int l=a[0];
		for(int s:a) {
			if(l<s) {
				l=s;
			}
			
		}
		System.out.println("Largest element is"+l);

	}

}
