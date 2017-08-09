package Main;

/**
 * Created by lduan on 8/4/17.
 */
public class TwoSum {
    public int[] findTwoSum(int[] nums, int target) {
        int finalArray[] = new int[2];

        for(int i=0; i<nums.length-1; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    finalArray[0] = i;
                    finalArray[1] = j;
                    return(finalArray);
                }
            }
        }
        return finalArray;
    }
}
