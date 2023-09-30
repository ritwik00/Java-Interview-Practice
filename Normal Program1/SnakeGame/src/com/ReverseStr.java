package com;

import java.util.Scanner;
import java.io.*;
import java.lang.*;

public class ReverseStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  a sentance");
		String s = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		StringBuilder str =sb.reverse();
		System.out.println(str);

	}

}
