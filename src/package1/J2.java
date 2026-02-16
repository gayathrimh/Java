public class J2{

    public static String calc1(int num1,int num2){

        int sum1=num1+num2;
        int dif1=num1-num2;
        int mul1=num1*num2;
        int div1=num1/num2;

        System.out.println(sum1+","+dif1+","+mul1+","+div1);
        return "success";
    }

    public static void main(String args[]){
     calc1(9,9);
     calc1(5,7);
    }
}