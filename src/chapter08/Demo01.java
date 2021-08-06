package chapter08;

import java.util.ArrayList;
import java.util.List;

public class Demo01 {
    public List<String> fizzBuzz(int n) {
        List<String> strArr = new ArrayList<>();
        for (int i=1;i<=n;i++){
            if (i%3==0 && i%5==0){
                strArr.add("FizzBuzz");
            }else if (i%3==0){
                strArr.add("Fizz");
            }else if (i%5==0){
                strArr.add("Buzz");
            }else {
                strArr.add(i+"");
            }
        }
        return strArr;
    }
}
