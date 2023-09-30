import java.util.Scanner;

class Num{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        String num = (a>=0)?"positive":"negative";
        System.out.println(a+"  is  "+num);
    }
}