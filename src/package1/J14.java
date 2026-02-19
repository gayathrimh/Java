package package1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J14 {
    public static void main(String args[])throws FileNotFoundException,IOException{

        File f1=new File("in2.txt");
        FileWriter fw1=new FileWriter("out1.txt");
        Scanner sc1=new Scanner(f1);
        String s1=sc1.nextLine();
        String[]arr1=s1.split(",");
        int start=Integer.parseInt(arr1[0]);
        int end=Integer.parseInt(arr1[1]);
        String info1="";
       
        for(int j=start;j<=end;j++){
            int num=j;
            System.out.println();
            for(int i=1;i<=10;i++){
                info1=num+"x"+i+"="+(num*i);
                System.out.println(info1);
                fw1.write(info1);
                fw1.write("\n");
            }
            fw1.write("\n");
        }
        fw1.close();
    }
}
