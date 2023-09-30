import java.util.Scanner;

public class SumOfDigit {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a num:");
        int n =sc.nextInt();
        int s=sumOfDigit(n);
        System.out.println("the large digit "+s);
    }

static int sumOfDigit(int n) {
    int re;
    int sum=0;
    while(n>0){
        re = n%10;
        sum = sum+re;
        n=n/10;

    }
    return sum;
}
}

