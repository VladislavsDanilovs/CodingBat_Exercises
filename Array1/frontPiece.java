/*

Given an int array of any length, return a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.

frontPiece([1, 2, 3]) → [1, 2]
frontPiece([1, 2]) → [1, 2]
frontPiece([1]) → [1]
 */

package Array1;

import java.util.Arrays;

public class frontPiece {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(frontPiece(array1)));
    }

    public static int[] frontPiece(int[] nums) {
        int[] result = new int[nums.length];
        if (nums.length < 2) {
            result = nums;
        } else {
            result = new int[]{nums[0], nums[1]};
        }
        return result;
    }

}
