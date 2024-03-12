package challenges;

public class StringExamples {

    public static void main(String[] args) {

        System.out.println(reverseWord("Hola Mundo"));
        System.out.println(countLatters("HOLA", 'O'));
        System.out.println(containsVowels("Hola"));

    }

    public static String reverseWord(String word) {
        String newWord = "";
//        StringBuilder newWord = new StringBuilder();

        for (int i = word.length() - 1; i >= 0; i--) {
            newWord += word.charAt(i);
//            newWord.append(word.charAt(i));
        }
        return newWord;
//        return newWord.toString();
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
}