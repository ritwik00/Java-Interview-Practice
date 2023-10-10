package com;

public class Array {
	public static void main(String[] args) {
		ArraySoluation as = new ArraySoluation();
		int[] ar = as.readArray();
		as.display(ar);
		System.out.println("------------------------");
		int[] ar1 =as.readArray();
		as.display(ar1);
		System.out.println();
//		
		System.out.println("Enter the element :");
		int n =as.readElement();
		
		int fre=as.getFrequency(ar,n);
		System.out.println("The frequency of "+11+" is: "+fre);
		System.out.println("----------------------------------");
		
		as.uniqueArray(ar);
		System.out.println("-------------------------");
		
		as.duplicateElement(ar);
		
		System.out.println("------------------------");
		as.commonElement(ar,ar1);
		
	}
}
