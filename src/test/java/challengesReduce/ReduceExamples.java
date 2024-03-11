package challengesReduce;

import java.util.Arrays;
import java.util.List;

public class ReduceExamples {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        System.out.println(sumAllNumbers(numbers));
        System.out.println(multiplyAllNumbers(numbers));

        List<String> word = Arrays.asList("Hola", " ", "mundo", "!");
        System.out.println(concatenate(word));



    }


    public static Integer sumAllNumbers(List<Integer> numbers) {
        return numbers.stream().reduce(0, Integer::sum);
    }

    public static Integer multiplyAllNumbers(List<Integer> numbers) {
        return numbers.stream().reduce(1, (a, b) -> a * b);
    }

    public static String concatenate(List<String> word) {
        return word.stream().reduce("", (a,b) -> a +b);
    }


}
