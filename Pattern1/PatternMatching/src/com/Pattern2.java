package com;
import java.util.Scanner;
/*
10101
01010
10101
01010
10101
*/

public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		for(int i=1;i<=a;i++) {
			int num = (i%2==0)?0:1;
			System.out.print(num);
			for(int j=1;j<a;j++) {
				num=(num==1)?0:1;
				System.out.print(num);
			}
			System.out.println();
		}

	}

}
