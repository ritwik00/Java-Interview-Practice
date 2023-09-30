import java.util.Scanner;
//Ritwik Biswas
public class SumBigSmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num:");
        int n =sc.nextInt();
        int s=bigDigit(n);
        int x = smallDigit(n);
        System.out.println("the diff is:"+(s-x));
        

    }

    static int smallDigit(int n) {
        int small=9;
        do{
            int d= n%10;
            if(d<small){
            small=d;
            }
         n=n/10;
        }while(n!=0);
        return small;
    }

    static int bigDigit(int n) {
        int larg=-9;
        while(n>0){
            int re=n%10;
            if(re>larg){
                larg=re;
            }
            n=n/10;

        }
        return larg ;
    }

}