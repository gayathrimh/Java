package package1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J12 {
    public static void main(String args[])throws FileNotFoundException{
        File f1=new File("in1.txt");
        Scanner sc1=new Scanner(f1);
        int start=Integer.parseInt(sc1.nextLine());
        int end=Integer.parseInt(sc1.nextLine());

        for(int j=start;j<=end;j++){
            int num=j;
            System.out.println();
            for(int i=1;i<=10;i++){
                System.out.println(num+"x"+i+"="+(num*i));
            }
        }
    }
}
