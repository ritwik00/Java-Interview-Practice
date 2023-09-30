package com;
import java.util.Scanner;
//Ritwik Biswas
public class Amnstrong {
	public static void main(String[] args) {
		for(int i=100;i<=999;i++){
			boolean r = isAmnstrong(i);
			if(r)
			{
				System.out.println(i+" is a Amnstrong number.");  
			}
		}

	}

	static boolean isAmnstrong(int i) {
		int sum=0,temp=i;
		int ds=countDigit(i);
		do {
			int r = i%10;
			sum=sum+pow(r,ds);
			i=i/10;
		}while(i!=0);
		if(sum==temp) {
			return true;
		}else {
			return false;
		}
	}


	static int countDigit(int i) {
		int count= 0;
		do {
			count++;
			i=i/10;
		}while(i!=0);
		return count;
	}


	static int pow(int i, int j){
		int pw=1;
		while(j>0) {
			pw=pw*i;
			j--;
		}
		return pw;
	}

}
