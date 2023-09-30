import java.util.Scanner;
/*
 * 
123454321
 2345432
  34543
   454
    5
 */

public class Pattern3 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print(j);
            }
            for(int j=4;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
