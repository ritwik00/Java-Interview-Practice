import java.util.Scanner;
 /*
 abcdedcba
 abcdcba
  abcba
   aba
    a*/

public class Pattern6 {
    
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            char x='a';
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
