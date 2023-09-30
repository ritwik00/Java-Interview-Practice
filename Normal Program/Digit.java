import java.util.Scanner;

class Digit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value:");
        int a = sc.nextInt();
        String dig = (a/10==0)?"digit":"number";
        System.out.println("this value is  "+dig);
    }
}