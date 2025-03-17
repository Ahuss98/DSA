import java.util.HashMap;
import java.util.Map;

public class Questions {

/*
Given a string, return the letter with the least frequency that appears first in the given string.
- Ignore case, numbers, and special characters

"Hello world" -> 'h'
"good evening" -> 'd'
"aaa123aaaaaaaaa" -> 'a'
"!GREAT" -> 'g'
 */

    public static char getLeastFrequentLetter(String word) {
        Map<Character, Integer> myHashMap = new HashMap<>();


        for (int i = 0; i < word.length(); i++) {
            char letter = Character.toLowerCase(word.charAt(i));
            if (Character.isLetter(letter)) {
                myHashMap.put(letter, myHashMap.getOrDefault(letter, 0) + 1);
            }
        }


        char leastFrequent = '\0';
        int minFrequency = Integer.MAX_VALUE;

        for (int i = 0; i < word.length(); i++) {
            char letter = Character.toLowerCase(word.charAt(i));
            if (Character.isLetter(letter) && myHashMap.get(letter) < minFrequency) {
                leastFrequent = letter;
                minFrequency = myHashMap.get(letter);
            }
        }

        return leastFrequent;
    }

    public static void main(String[] args) {
        System.out.println(getLeastFrequentLetter("Hello world") == 'h');
        System.out.println(getLeastFrequentLetter("good evening") == 'd');
        System.out.println(getLeastFrequentLetter("aaa123aaaaaaaaa") == 'a');
        System.out.println(getLeastFrequentLetter("!GREAT") == 'g');
    }
}

