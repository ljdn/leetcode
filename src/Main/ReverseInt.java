package Main;

/**
 * Created by lduan on 8/4/17.
 */
public class ReverseInt {
    public int reverseInt(int x) {
        boolean intIsNegative = x < 0;

        if (intIsNegative) {
            x *= -1;
        }

        long output = 0;
        while (x > 0) {
            output = output * 10 + x % 10;
            x /= 10;
        }

        int shortenedOutput = (int) output;
        if (shortenedOutput != output) {
            return 0;
        }else if (intIsNegative) {
            return shortenedOutput * -1;
        } else {
            return shortenedOutput;
        }
    }
}
