import java.util.Scanner;
public class Temp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temp in celcious:");
        double c = sc.nextDouble();
        double faherenite = (9*c)/5+32;
         System.out.println("The fahrenhite temp is :"+ faherenite);

    }
}