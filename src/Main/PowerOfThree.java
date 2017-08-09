package Main;

/**
 * Created by lduan on 8/5/17.
 */
public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        int power = 0;
        while (Math.pow(3, power) <= n) {
            if (Math.pow(3, power) == n) {
                return true;
            }
            power++;
        }

        return false;
    }
}
