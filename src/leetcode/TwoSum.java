/**
 * @author :arjun
 * Project :Data-Structure-Algorithm-Java
 * Date : 2020-12-26
 * Time : 18:34
 */
package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

        int[] numbers = {2, 3, 4, 4, 7, 8};
        int target = 7;
        int[] result = getTwoSum(numbers, target);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] getTwoSum(int[] arr, int target) {
        Map<Integer, Integer> visitedNumber = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int delta = target - arr[i];
            if (visitedNumber.containsKey(delta)) {
                return new int[]{
                        i, visitedNumber.get(delta)
                };
            }
            visitedNumber.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }
}
