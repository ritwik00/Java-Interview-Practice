package com;
//Ritwik Biswas
import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		for(int i=100;i<=999;i++)
		{
			int rs=isPalindron(i);
			
			if(rs==i)
				System.out.println(i);
		}
	}

	static int isPalindron(int i) {
		int re =0;
		while(i!=0) {
			int d=i%10;
			re = re*10+d;
			i/=10;
			
		}
		return re;
	}

}
