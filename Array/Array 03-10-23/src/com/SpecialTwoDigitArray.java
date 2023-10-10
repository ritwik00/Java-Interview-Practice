package com;

import java.util.Scanner;

class SpecialTwoDigitArray {

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

		int s = disArray(a);
		System.out.println("The count of special two digit element is: "+s);

	}

	static int disArray(int[] a) {
		int count=0;
		
		for(int i=0;i<a.length-1;i++) {
			if(isSpecial(a[i]))
				count++;
		}
		return count;
		
	}

	private static boolean isSpecial(int x) {
		int sum=0,mul=1,t=x;
		do {
			int r = x%10;
			sum+=r;
			mul*=r;
			x/=10;
			
		}while(x!=0);
		int temp=sum+mul;
		return temp==t;
	

	}

}
