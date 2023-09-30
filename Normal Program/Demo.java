import java.util.Scanner;
public class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        double a = sc.nextDouble();
        System.out.println("Enter second number:");
        double b = sc.nextDouble();
        double value = (a+b)*(a+b);
         System.out.println("The eve value is:"+value);

    }
}