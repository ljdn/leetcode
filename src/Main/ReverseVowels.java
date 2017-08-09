package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by lduan on 8/6/17.
 */
public class ReverseVowels {
    public String reverseVowels(String s) {
        ArrayList<Character> VOWELS = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        ArrayList<Integer> indices = new ArrayList<>();
        ArrayList<Character> vowels = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (VOWELS.contains(s.charAt(i))) {
                vowels.add(s.charAt(i));
            }
            if (VOWELS.contains(s.charAt(s.length() - i - 1))) {
                indices.add(s.length() - i - 1);
            }
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < indices.size(); i++) {
            chars[indices.get(i)] = vowels.get(i);
        }

        return new String(chars);

    }
}
