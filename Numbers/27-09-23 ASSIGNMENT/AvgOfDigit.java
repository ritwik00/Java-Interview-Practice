import java.util.Scanner;
//Ritwik Biswas
public class AvgOfDigit {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a num:");
        int n =sc.nextInt();
        double s=sumOfDigit(n);
        System.out.println("the avg is:  "+s);
    }

static double sumOfDigit(int n) {
    double count=0;
    double sum=0;
    do{
        int d=n%10;
        sum+=d;
        n=n/10;
        count++;
    }while(n!=0);
    return  (sum/count);
}
}

