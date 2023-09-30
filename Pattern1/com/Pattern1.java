package com;
import java.util.Scanner;
/*
10101
01010
10101
01010
10101
*/
public class Pattern1{  
	public static void main(String[] args)   {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value:");
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++)   {  
			int num;  
			if(i%2 == 0)  {  
				num = 0;  
				for (int j = 1; j <= a; j++)  {  
					System.out.print(num);  
					num = (num == 0)? 1 : 0;  
				}  
			}  
			else  
			{  
				num = 1;  
				for (int j = 1; j <= a; j++)  
				{  
					System.out.print(num);  
					num = (num == 0)? 1 : 0;  
				}  
			}  
			System.out.println();  
		}  
	}  
}