import java.util.Scanner;

public class Square{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER SIDE LENGTH:");
        double a = sc.nextDouble();
        double PRE = a*a;
        double area = 4*a;
        System.out.println("The Area is:"+area);
        System.out.println("THE perimeter is:"+PRE); 
    }
}