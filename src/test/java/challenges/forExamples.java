package challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class forExamples {


    public static void main(String[] args) {
        System.out.println(factorial(5));
        List<Integer> numbers = Arrays.asList(10, 25, 7, 42, 18, 3, 65, 23);
        System.out.println(findMayor(numbers));
    }

    public static Integer factorial(int num) {

       Integer total = 1;

       for(int i = 1; i <= num; i ++ ){
           total *= i;
       }
        return total;
    }

    public static Integer findMayor(List<Integer> numbers) {

        Integer first = numbers.getFirst();

        for(int i = 1; i < numbers.size(); i++) {
            if(numbers.get(i) > first){
                first = numbers.get(i);
            }
        }
        return first;
    }

}