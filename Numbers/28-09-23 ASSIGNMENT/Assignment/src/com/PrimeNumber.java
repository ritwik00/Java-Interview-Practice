package com;
import java.util.Scanner;
//Ritwik Biswas
//Prime Number in  a range
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for(int j=2;j<=n;j++){
           if(isPrime(j)){
                System.out.println(j);
           }
        }
    }

    private static boolean isPrime(int n) {
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
