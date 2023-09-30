import java.util.Scanner;
/*
 * 
    1
   101
  10101
 1010101
101010101
 */

public class Pattern8 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++){
                System.out.print(j%2);
            }
            System.out.println();
        }
    } 
}
