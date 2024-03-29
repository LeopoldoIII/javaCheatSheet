package challenges;

import java.util.Arrays;
import java.util.List;

public class forExamples {


    public static void main(String[] args) {
        System.out.println(factorial(5));
        List<Integer> numbers = Arrays.asList(10, 25, 7, 42, 18, 3, 65, 23);
        System.out.println(findMayor(numbers));
        sumDigit(222);
        System.out.println(sumNumbers(222));
    }

    public static Integer factorial(int num) {

       Integer total = 1;

       for(int i = 1; i <= num; i ++ ){
           total *= i;
       }
        return total;
    }

    public static Integer findMayor(List<Integer> numbers) {

        Integer first = numbers.get(0);

        for(int i = 1; i < numbers.size(); i++) {
            if(numbers.get(i) > first){
                first = numbers.get(i);
            }
        }
        return first;
    }

    public static void sumDigit(int num) {
        int sum = 0;

        for(int temp = num; temp !=0; temp /= 10 ) {
            int digit = temp % 10;
            sum += digit;
        }
        System.out.println(sum);
    }

    /*
     *This program takes an integer as input (num) and calculates the sum of its individual digits.
     * For example, if you call this method with the argument 123, it will return 1 + 2 + 3 = 6.
     *
     */
    public static Integer sumNumbers(int num) {
        int total = 0;

        List<Integer> listOfNumbers = Arrays.stream(String.valueOf(num).split("")).
                map(Integer::parseInt).toList();

        for (Integer n : listOfNumbers) {
            total += n;
        }
        return total;
    }
}