package package1;
import java.util.Scanner;

public class J11 {
    public static void main(String args[]){
        Scanner sc1=new Scanner(System.in);

        System.out.println("enter first number");
        int start=sc1.nextInt();
        System.out.println("enter second number");
        int end=sc1.nextInt();

        for(int j=start;j<=end;j++){
            int num=j;
            System.out.println();
            for(int i=1;i<=10;i++){
                System.out.println(num+"x"+i+"="+(num*i));

            }
        }
    }
}
