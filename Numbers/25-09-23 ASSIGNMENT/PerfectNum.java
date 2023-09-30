import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int n=sc.nextInt();
        boolean s=perfectNum(n);
        if(s==true){
            System.out.println(n+"is a Perfect nuber");
        }
        else
        System.out.println(n+"is no perfcet Number");

    }

    static boolean perfectNum(int num) {
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==num)
        return true;
        else
        return false;
    
    }

}
