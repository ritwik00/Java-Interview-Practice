import java.util.Scanner;

public class Amnstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range");
        int n = sc.nextInt();
        int count=0;
        for(int i=2;i<=n;i++){
            if(isAmnstrong(i))
            {
              System.out.println(i);  
            }
        }
       
    }

    private static boolean isAmnstrong(int i) {
        int sum=0,temp=i;
        int ds=countDigit(i);
        do(
            int r = i%10;
            sum=sum+pow(r*ds);
            i=i/10;
        )while(i!=0)
        return sum==temp;
    }

    private static int countDigit(int i) {
        return 0;
    }
    static int pow(int i, int j){
        return 0;
    }

}
