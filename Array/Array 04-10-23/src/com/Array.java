package com;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		ArraySoluation as = new ArraySoluation();
		int[] s = as.readArray();
		as.display(s);
		System.out.println("------------------------");
		
		int[] np = as.neagPos(s);
		System.out.println("The count of negative number is: "+np[0]);
		System.out.println("The count of positive number is: "+np[1]);
		
		System.out.println("------------------------------");

		int[] sum = as.sumOfOddEven(s);
		System.out.println("The sum of even number is: "+sum[0]);
		System.out.println("The sum of odd number is: "+sum[1]);
		
		System.out.println("-----------------------------");
		int pl=as.countPalindrom(s);
		System.out.println("The count of palindrom number is: "+pl);
		
		System.out.println("-------------------------------------");
		System.out.println("The reverse of the array is: ");
		as.reverseArray(s);
		
		System.out.println("---------------------------------------");
		System.out.println("The copy is--");
		as.copy(s);
		
	}
}


