import java.util.Scanner;
/*
    1
   1*2
  1*2*3
 1*2*3*4
1*2*3*4*5 */
public class Pattern10 {
  
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt(); 
        int x=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			
				
				if(j<i) {
					System.out.print("*");
				}
			}
			System.out.println();
		} 
	}
}

