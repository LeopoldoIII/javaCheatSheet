package challenges;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        String word = "Holaa";

        System.out.println(counter(word));
    }

    public static Map<Character, Integer> counter(String string){

        Map<Character, Integer> ocurrence = new HashMap<>();

        for(char caracter : string.toCharArray()) {
            if(ocurrence.containsKey(caracter)){
                ocurrence.put(caracter, ocurrence.get(caracter) + 1);
            }else  {
                ocurrence.put(caracter, 1);
            }
        }
        return ocurrence;
    }
}
