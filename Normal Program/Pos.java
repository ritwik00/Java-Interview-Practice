import java.util.Scanner;

class Pos{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int a = sc.nextInt();
        int pos = (a<0)?(a*-1):a;
        System.out.println(pos);
    }
}