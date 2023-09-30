import java.util.Scanner;
public class Interest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle ammount:");
        double p = sc.nextDouble();
        System.out.println("Enter rate of interest:");
        double r = sc.nextDouble();
        System.out.println("Enter time:");
        double t=sc.nextDouble();
        double interest = (p*t*r)/100;
         System.out.println("The area is:"+interest);

    }
}