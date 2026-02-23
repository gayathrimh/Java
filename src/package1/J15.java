package package1;

import java.util.ArrayList;
import java.util.List;

public class J15 {
    public static void main(String args[]){
        System.out.println("Andaman Prisoner");
        int count=100;
        List<String>prisons=new ArrayList<>();
        List<Integer>lucky=new ArrayList<>();
        for(int i=0;i<count;i++){
            prisons.add("C");
        }
        System.out.println("Opening: "+prisons);
        for(int i=0;i<count;i++){
            prisons.set(i,"O");
        }
        System.out.println("Round 1: " +prisons);
        for(int i=1;i<count;i=i+2){
            prisons.set(i,"C");
        }
        System.out.println("Round 2: "+prisons);
        for(int j=2;j<count;j++){
            for(int i=j;i<count;i=i+j+1){
                if(prisons.get(i).equals("C")){
                    prisons.set(i,"O");
                }
                else {
                    prisons.set(i, "C");
                }
            }
            System.out.println("Round "+(j+1)+": " +prisons);
        }
        for(int i=0;i<count;i++){
            if(prisons.get(i).equals("O")){
                lucky.add(i+1);
            }
        }
        System.out.println("lucky: "+lucky);
    }
}
