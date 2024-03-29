package challenges;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringExamples {

    public static void main(String[] args) {

        System.out.println(reverseWord("Hola Mundo"));
        System.out.println(countLatters("HOLA", 'O'));
        System.out.println(containsVowels("Hola"));
        System.out.println(reversWordStringBuilder("Hola"));
        System.out.println(wordCounter("Hello word"));
        System.out.println(isPrime(7));

    }

    public static String reverseWord(String word) {
        String newWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            newWord += word.charAt(i);
//            newWord.append(word.charAt(i));
        }
        return newWord;
//        return newWord.toString();


    }

    public static String reversWordStringBuilder(String word) {

        StringBuilder newWord = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            newWord.append(word.charAt(i));
        }
        return newWord.toString();
    }


    public static int countLatters(String word, char letter) {
        int total = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                total += 1;
            }
        }
        return total;
    }

    public static void swapNumbers() {
        int a = 10;
        int b = 20;

        System.out.println("a is " + a + " and b is " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping, a is " + a + " and b is " + b);
    }

    public static boolean containsVowels(String input) {
        return input.toLowerCase().matches(".*[aeiou].*");
    }

    public static Map<String, Integer> wordCounter(String sentence) {

        Map<String, Integer> outPut = new HashMap<>();

        List<String> wordList = List.of(sentence.split(" "));
        for (String word : wordList) {
            outPut.put(word, word.length());
        }
        return outPut;
    }

    public static boolean isPrime(Integer number) {

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }


}