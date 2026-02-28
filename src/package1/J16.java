package package1;

public class J16 {

    public static void diamond1(String str){
        int len1=str.length();
        for(int i=1;i<len1+1;i++){
            System.out.println(str.substring(0,i));
        }
        for(int i=len1-1;i>=0;i--){
            System.out.println(str.substring(0,i));
        }

    }
    public static void main(String[] args){

        diamond1("Gayathri");
        diamond1("Sanjana");

    }
}
