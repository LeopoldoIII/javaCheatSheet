package challengesFilter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> words = Arrays.asList("manzana", "banana", "pera", "melon", "sandía", "piña");
        System.out.println(filterWord(words, 'p'));
        System.out.println(filterPares(numbers));

    }

    public static List<Integer> filterPares(List<Integer> numbersList) {
        return numbersList.stream().filter(number -> number % 2 == 0).toList();
    }

    public static List<String> filterWord(List<String> listWords, char word ) {
       return listWords.stream().
                filter(w -> w.charAt(0) == word).toList();
    }

}