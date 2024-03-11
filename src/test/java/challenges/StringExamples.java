package challenges;

public class StringExamples {

    public static void main(String[] args) {

        String word = "Hola mundo";
        System.out.println(reverseWord(word));

        System.out.println(countLatters("HOLA", 'O'));

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


}