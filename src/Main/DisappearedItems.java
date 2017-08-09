package Main;

import java.util.*;

/**
 * Created by lduan on 8/4/17.
 */
public class DisappearedItems {
    /*
        Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

        Find all the elements of [1, n] inclusive that do not appear in this array.

        Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

        Example:

        Input:
        [4,3,2,7,8,2,3,1]

        Output:
        [5,6]
    */


    public List<Integer> findDisappearedNumbers(int[] nums) {

        HashMap<Integer, Integer> disappearedNums = makeSequencedHashMap(1, nums.length);

        for (int i = 0; i < nums.length; i++) {
            disappearedNums.remove(nums[i]);
        }


        return new ArrayList<>(disappearedNums.keySet());

    }


    public HashMap<Integer, Integer> makeSequencedHashMap(int begin, int end) {
        HashMap<Integer, Integer> newHashMap = new HashMap<Integer, Integer>();
        for (int i = begin; i <= end ; i++) {
            newHashMap.put(i, i);
        }

        return newHashMap;
    }


}
