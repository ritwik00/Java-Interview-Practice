import java.util.Scanner;
public class Smallest{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter 3 numbers");
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       int sml =(a<b)?((a<c)?a:c):((b<c)?b:c);
       System.out.println(sml+"is smallest");

    }
}