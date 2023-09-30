import java.util.Scanner;
public class AVG{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double z = (double)(a+b+c)/3;
        System.out.println("the avarage is :"+" "+z);
    }
}