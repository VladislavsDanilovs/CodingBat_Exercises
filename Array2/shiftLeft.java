/*

Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. You may modify and return the given array, or return a new array.


shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
shiftLeft([1, 2]) → [2, 1]
shiftLeft([1]) → [1]
[] -> []

 */

package Array2;

import java.util.Arrays;

public class shiftLeft {

    public static void main(String[] args) {
        int[] array = {};

        System.out.println(Arrays.toString(shiftLeft(array)));
    }

    public static int[] shiftLeft(int[] nums) {
        int[] result = new int[nums.length];
        if (nums.length == 0) {
            return result;
        }
        if (nums.length > 1) {
            for (int i = 1; i < nums.length - 1; i++) {
                result[i] = nums[i + 1];
            }
            result[0] = nums[1];
            result[nums.length - 1] = nums[0];
        } else {
            result[nums.length - 1] = nums[nums.length - 1];
        }
        return result;
    }
}
