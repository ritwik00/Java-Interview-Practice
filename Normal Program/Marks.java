import java.net.Socket;
import java.util.Scanner;

class Marks{
    public static void main(String[] args) {
         /*WAJPT take 4 sub marks of students and print the result like dision first class ,second class
          * and pass or fali
          */
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 4 marks");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if(a<35||b<35||c<35||d<35){
            System.out.println("fail");
        }else if(a<70||b<70||c<70||d<70){
            System.out.println("pass and get second class");
        }else{
            System.out.println("you pass and get first class ");
        }
        


    }
}