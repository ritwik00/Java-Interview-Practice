import java.util.*;
/*
 *  1
   000
  11111
 0000000
111111111
 */
public class Pattern7 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i*2-1;j++){
                System.out.print(i%2);
            }
            System.out.println();
        }
    }
}
