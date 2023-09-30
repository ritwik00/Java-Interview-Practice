package com;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n = sc.nextInt();
        for (int i = 3; i > 0; i--) {
            for (int j = 1; j < n * 2; j++) {
                if (j <= i) {
                    System.out.print(j + "");
                } else if (n * 2 - j <= i)
                    System.out.print(n * 2 - j + "");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
