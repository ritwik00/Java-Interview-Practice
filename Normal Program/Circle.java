import java.util.Scanner;

public class Circle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER RADIUS:");
        double r = sc.nextDouble();
        double area = 3.143*r*r;
        System.out.println("THE AREA IS :"+ area);
    }
}