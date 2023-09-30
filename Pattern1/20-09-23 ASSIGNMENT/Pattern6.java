import java.util.*;
/*
 **********
 *******
  *****
   ***
    *
 */

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
