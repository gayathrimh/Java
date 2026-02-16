package package1;
import java.util.List;
import java.util.ArrayList;
class Calculator{
    public List<Integer> calculate(int num1, int num2){
        List<Integer> output1=new ArrayList<>();
        int sum1=num1+num2;
        int dif1=num1-num2;
        int mlt1=num1*num2;
        output1.add(sum1);
        output1.add(dif1);
        output1.add(mlt1);
        return output1;
    }
}
public class J10 {
    public static void main(String[] args){
        Calculator c1=new Calculator();
        System.out.println(c1.calculate(8,4));
    }
}