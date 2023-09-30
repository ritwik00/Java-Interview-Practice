import java.util.Scanner;

public class BigDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num:");
        int n =sc.nextInt();
        int s=bigDigit(n);
        System.out.println("the large digit "+s);
        

    }

    static int bigDigit(int n) {
        int re;
        int larg=0;
        while(n>0){
            re=n%10;
            if(larg<re){
                larg=re;
            }
            n=n/10;

        }
        return larg ;
    }
}
