package com;

import java.util.Scanner;

class EvenOddArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int n = sc.nextInt();

		int[] a = new int[n];

		System.out.println("Enter the element");

		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

		disArray(a);

	}

	static void disArray(int[] a) {
		int od=0,ev=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0)
				od++;
			else
				ev++;
		}
		System.out.println("The count of even number is:"+ev);
		System.out.println("The count of odd number is: "+od);
		
	}

}
