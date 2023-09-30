import java.util.Scanner;
public class Findlargest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if(a>b && a>c)
        System.out.println(a+"is largest");
        else if (b>c && b>a)
        System.out.println(b+"is largest");
        else
        System.out.println(c+"is largest");
    }
}