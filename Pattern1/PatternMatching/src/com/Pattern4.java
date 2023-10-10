package com;
import java.util.*;
public class Pattern4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a =sc.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				int num = (i%2==0)?1:0;
				System.out.print(num);
			}
			System.out.println();
		}
	}

}
