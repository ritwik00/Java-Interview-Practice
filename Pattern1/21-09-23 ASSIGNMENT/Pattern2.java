import java.util.Scanner;
/*
 *  5
   545
  54345
 5432345
543212345
 */

public class Pattern2 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            int x=n;
            for(int j=1;j<=2*i-1;j++){
                System.out.print(x+"");
                if(j<i)
                x--;
                else
                x++;
            }
            System.out.println();
        }
    }
}
