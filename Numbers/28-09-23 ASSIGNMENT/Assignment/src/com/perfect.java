package com;
//Ritwik Biswas
import java.util.Scanner;

public class perfect {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++){
			int rs = isPerfect(i);
			
			if(rs==i) {
				System.out.println(i+" is a perfect number");
			}

		}
	}

	static int isPerfect(int i) {
		int sum=1;
		for(int j=2;j<=i/2;j++) {
			if(i%j==0) {
				sum=sum+j;
			}
		}
		return sum;
	}

}
