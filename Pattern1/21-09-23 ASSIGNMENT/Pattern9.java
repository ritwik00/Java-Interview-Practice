import java.util.Scanner;
/*
1 
2 6 
3 7 10 
4 8 11 13
5 9 12 14 15 */
public class Pattern9 {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int x=i;
            for(int j=1;j<=i;j++){
                System.out.print(x+" ");
                x=x+n-j;
            }
            System.out.println();
        }
} 
}
