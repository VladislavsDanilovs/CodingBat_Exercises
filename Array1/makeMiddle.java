/*
Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array. The original array will be length 2 or more.

makeMiddle([1, 2, 3, 4]) → [2, 3]
makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
makeMiddle([1, 2]) → [1, 2]
 */

package Array1;

import java.util.Arrays;

public class makeMiddle {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4};
        System.out.println(Arrays.toString(makeMiddle(array)));
    }

    public static int[] makeMiddle(int[] nums) {
        int[] result = new int[nums.length];
        if (nums.length == 2) {
            result = nums;
        }
        if (nums.length > 2) {
            result = new int[]{nums[nums.length / 2 - 1], nums[nums.length / 2]};
        }
        return result;
    }

}
