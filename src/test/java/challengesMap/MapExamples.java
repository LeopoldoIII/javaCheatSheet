package challengesMap;

import java.util.*;

public class MapExamples {


    public static void main(String[] args) {

        numbersToSquare();
        namesToCapital();

        List<String> words = Arrays.asList("perro", "gato", "perro", "perro", "gato", "ratón", "perro",
                "gato", "ratón", "ratón", "perro", "gato");

        System.out.println(countWords(words));


        productNumbers();
        MaxMinNumber();

    }


    public static void numbersToSquare() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> squareNumbers = numbers.stream()
                .map(n -> n * n)
                .toList();

        squareNumbers.forEach(System.out::println);
    }

    public static void namesToCapital() {
        List<String> names = Arrays.asList("juan", "Maria", "Pedro", "ana");

        List<String> capitalNames = names.stream()
                .map(name -> name.toUpperCase()).toList();

        capitalNames.forEach(System.out::println);
    }

    public static Map<String, Integer> countWords(List<String> words) {

        Map<String, Integer> counter = new HashMap<>();

        for (String word : words) {
            counter.put(word, counter.getOrDefault(word, 0) + 1);
        }

        return counter;
    }


    public static void productNumbers() {

        List<Integer> numbers = Arrays.asList(2, 3, 5, 7, 11, 13);
        Integer total = 1;

        for (Integer num : numbers) {
            total *= num;
        }
        System.out.println(total);
    }


    public static void MaxMinNumber() {

        List<Integer> numbers = Arrays.asList(10, 25, 3, 17, 8, 31, 12);
        int min;
        int max;

        Collections.sort(numbers);
        min = numbers.get(0);
        max = numbers.get(0);

        for (Integer num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }

        }
        System.out.println("Max " + max + " Min " + min);
    }


    public static void MaxMinNumberStream() {

        List<Integer> numbers = Arrays.asList(10, 25, 3, 17, 8, 31, 12);

        Integer max = numbers.stream()
                .max(Integer::compareTo)
                .orElseThrow();

        Integer min = numbers.stream()
                .min(Integer::compareTo)
                .orElseThrow();


        System.out.println("Max " + max + " Min " + min);
    }
}