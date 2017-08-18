package Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by lduan on 8/9/17.
 */
public class ValidParentheses {
    /*
    Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

    The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
     */

    public boolean isValid(String s) {
        HashMap<Character, Character> pairs = new HashMap<>();
        pairs.put(')', '(');
        pairs.put(']', '[');
        pairs.put('}', '{');

        List<Character> brackets = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (!(pairs.keySet().contains(s.charAt(i)))) brackets.add(s.charAt(i));
            else if (brackets.isEmpty() || (brackets.get(brackets.size()-1) != pairs.get(s.charAt(i)))) return false;
            else brackets.remove(brackets.size()-1);
        }

        if (brackets.isEmpty()) return true;
        else return false;

    }
}
