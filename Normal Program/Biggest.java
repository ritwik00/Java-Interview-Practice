import java.util.Scanner;

class Biggest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numbers:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double big =(a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println(big+"is biggest");
    }
}