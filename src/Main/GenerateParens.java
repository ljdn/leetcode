package Main;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lduan on 8/12/17.
 */
public class GenerateParens {
    /**
     * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

     For example, given n = 3, a solution set is:

     [
     "((()))",
     "(()())",
     "(())()",
     "()(())",
     "()()()"
     ]

     */

    /*
    (((
     */


    public List<String> generateParenthesis(int n) {
        List<String> parens = new ArrayList<>();

        if (n==0) return parens;

        generateNextParen(n, parens, "(", 1, 0);
        return parens;
    }

    public void generateNextParen(int n, List<String> generated, String current, int openParens, int closedParens) {
        if (current.length() == n*2) {
            generated.add(current);
            return;
        }
        if (openParens != closedParens) {
            generateNextParen(n, generated, current + ")", openParens, closedParens + 1);
        }
        if (openParens < n) {
            generateNextParen(n, generated, current + "(", openParens + 1, closedParens);
        }
    }

}
