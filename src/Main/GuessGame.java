package Main;

/**
 * Created by lduan on 8/8/17.
 */
public class Solution extends GuessGame {
    /*
    We are playing the Guess Game. The game is as follows:

    I pick a number from 1 to n. You have to guess which number I picked.

    Every time you guess wrong, I'll tell you whether the number is higher or lower.

    You call a pre-defined API guess(int num) which returns 3 possible results (-1, 1, or 0):

            -1 : My number is lower
            1 : My number is higher
            0 : Congrats! You got it!
    Example:
    n = 10, I pick 6.

    Return 6.
    */

    public int guessNumber(int n) {
        return tryGuess(1, n);
    }

    public int tryGuess(int lowerBound, int upperBound) {
        int myGuess = (lowerBound + (upperBound + 1 - lowerBound) / 2;
        if (guess(myGuess) == -1) {
            return tryGuess(lowerBound, myGuess-1);
        }
        else if (guess(myGuess) == 1) {
            return tryGuess(myGuess + 1, upperBound);
        } else return myGuess;
    }
}
