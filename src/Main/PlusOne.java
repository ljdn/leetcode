package Main;

/**
 * Created by lduan on 8/5/17.
 */
public class PlusOne {
    /*
    Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.

    You may assume the integer do not contain any leading zero, except the number 0 itself.

    The digits are stored such that the most significant digit is at the head of the list.
     */

    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            if (digits[i] >= 10) {
                digits[i] -= 10;
                if (i == 0) {
                    int[] biggerArray = new int[digits.length + 1];
                    biggerArray[0] = 1;
                    return biggerArray;
                }
            } else {
                return digits;
            }

        }
        return digits;
    }
}
