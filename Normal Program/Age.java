import java.util.Scanner;
public class Age{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:");
        int age = sc.nextInt();
        if (age>=18)
        System.out.println("you are eligable for vote ");
        else
        System.out.println("you are not eligable for vote");
       
    }
}