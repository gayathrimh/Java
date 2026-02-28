package package1;

public class J17 {
    public static void diamond1(String str){
        int len1=str.length();


        for(int i=0;i<len1;i++){
            for(int j=0;j<len1-(i+1);j++){
                System.out.print(" ");
            }
            System.out.println(str.substring(0,i+1));
        }
        for(int i=len1-1;i>=1;i--){
            for(int j=0;j<len1-i;j++){
                System.out.print(" ");
            }
            System.out.println(str.substring(0,i));
        }
    }
    public static void main(String args[]){
       diamond1("Gayathri");
       diamond1("Sanjana");
    }
}
