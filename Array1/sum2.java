/*
Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.

sum2([1, 2, 3]) → 3
sum2([1, 1]) → 2
sum2([1, 1, 1, 1]) → 2
 */

package Array1;

import java.util.Arrays;

public class sum2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println(sum2(array));
    }

    public static int sum2(int[] nums) {
        int result = 0;
        result = (nums.length == 0) ? 0 : (nums.length > 1) ? nums[0] + nums[1]
                : (nums.length == 1) ? nums[0] : result;
        return result;
    }

}
