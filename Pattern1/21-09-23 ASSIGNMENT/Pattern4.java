import java.util.Scanner;
/*
//
123454321
 1234321
  12321
   121
    1
     */

public class Pattern4 {
    
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            int x=1;
            for(int j=1;j<=2*i-1;j++){
                System.out.print(x+"");
                if(j<i)
                x++;
                else
                x--;
            }
            System.out.println();
        }
    }
}
