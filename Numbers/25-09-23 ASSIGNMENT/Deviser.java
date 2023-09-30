import java.util.Scanner;

public class Deviser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = deviser(n);
        System.out.println("The count of diviser is: "+s);
    }

    static int deviser(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
            count++;
            }
        }
        return count;
    }
    
}
