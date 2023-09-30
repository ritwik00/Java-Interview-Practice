package com;
import java.util.Scanner;
import java.util.*;

public class SnakeGame {
	static int flipDice(int count) {
		Random rd = new Random();
		int score=rd.nextInt(6)+1;
		System.out.println("your score is "+score);
		if(count+score<=100) {
			count=count+score;
		}
		switch(count) {
		case 1:
			count = 38;
			System.out.println("jump up  to "+count);
			break;
		case 4:
			count = 14;
			System.out.println("jump up  to "+count);
			break;
		case 8:
			count = 30;
			System.out.println("jump up  to "+count);
			break;
		case 21:
			count = 42;
			System.out.println("jump up  to "+count);
			break;
		case 28:
			count = 76;
			System.out.println("jump up  to "+count);
			break;
		case 50:
			count = 67;
			System.out.println("jump up  to "+count);
			break;
		case 80:
			count = 99;
			System.out.println("jump up  to "+count);
			break;
		case 71:
			count = 92;
			System.out.println("jump up  to "+count);
			break;
		case 63:
			count = 18;
			System.out.println("drop down  to "+count);
			break;
		case 36:
			count = 6;
			System.out.println("drop down  to "+count);
			break;
		case 32:
			count = 10;
			System.out.println("drop down  to "+count);
			break;
		case 48:
			count = 26;
			System.out.println("drop down  to "+count);
			break;
		case 97:
			count = 78;
			System.out.println("drop down  to "+count);
			break;
		case 95:
			count = 56;
			System.out.println("drop down  to "+count);
			break;
		case 88:
			count = 24;
			System.out.println("drop down  to "+count);
			break;
		}
		System.out.println("Your total score "+count);
		return count;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first player name:");
		String fname=sc.next();
		System.out.println("Enter Second player name");
		String sname = sc.next();
		int fcount=0,scount=0;
		while(true){
		System.out.println(fname+" Press any button to start the game");
		sc.next();
		fcount = flipDice(fcount);
		if(fcount==100) {
			System.out.println(fname+" won the game.");
			break;
		}
		System.out.println(sname+" press any button to start the game ");
		sc.next();
		scount = flipDice(scount);
		if(scount==100) {
			System.out.println(sname+" won the game");
			break;
		}
		}
		
	}

}
