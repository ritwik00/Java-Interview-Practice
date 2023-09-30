import java.util.Scanner;
public class Rectangl
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length:");
        double L = sc.nextDouble();
        System.out.println("Enter Width:");
        double W = sc.nextDouble();
        double perimeter = 2*(L+W); 
        double area = L*W;
         System.out.println("The area is:"+area);
          System.out.println("The perimeter is"+perimeter);

    }
}