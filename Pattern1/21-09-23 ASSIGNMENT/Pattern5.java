import java.util.Scanner;
/*
543212345
 5432345
  54345
   545
    5 */
public class Pattern5 {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print("-");
            }
            int x=5;
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
