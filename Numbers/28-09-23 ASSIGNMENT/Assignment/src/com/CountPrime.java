package com;
import java.util.Scanner;
//Ritwik Biswas
//Count Prime Numbers in range
public class CountPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range");
        int n = sc.nextInt();
        int count=0;
        for(int i=2;i<=n;i++){
            if(isPrime(i))
            {
               count++;
            }
        }
        System.out.println(count);
    }

    private static boolean isPrime(int i) {
        int count=2;
        for(int j=2;j<=i/2;j++)
        {
            if(i%j==0)
            {
              count++;  
            }
        }
        return count==2;
    }
}
