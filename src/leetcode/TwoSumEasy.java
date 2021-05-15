/**
 * @author Arjun Gautam
 * Project :Data-Structure-Algorithm-Java
 * Date : 2021-05-15
 * Time : 22:45
 */
package leetcode;

public class TwoSumEasy {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        throw new IllegalArgumentException("No two solutions");
    }
}

