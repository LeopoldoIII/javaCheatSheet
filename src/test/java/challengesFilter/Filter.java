package challengesFilter;

import java.util.Arrays;
import java.util.List;

public class Filter {

    public static void main(String[] args) {

      filterSquaredNumber();

    }

    public static void  filterSquaredNumber () {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n * n)
                .toList();
        System.out.println(squaredNumbers);
    }









}
