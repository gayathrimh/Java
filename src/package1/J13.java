package package1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J13 {
    public static void main(String args[])throws FileNotFoundException{

        File f1=new File("in2.txt");
        Scanner sc1=new Scanner(f1);
        String s1=sc1.nextLine();
        String[]arr1=s1.split(",");
        int start=Integer.parseInt(arr1[0]);
        int end=Integer.parseInt(arr1[1]);

        for(int j=start;j<=end;j++){
            int num=j;
            System.out.println();
            for(int i=1;i<=10;i++){
                System.out.println(num+"x"+i+"="+(num*i));
            }
        }
    }
}
