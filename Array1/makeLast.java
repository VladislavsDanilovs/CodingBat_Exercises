/*

Given an int array, return a new array with double the length where its last element is the same as the original array, and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.


makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
makeLast([1, 2]) → [0, 0, 0, 2]
makeLast([3]) → [0, 3]

 */

package Array1;

import java.util.Arrays;

public class makeLast {
    public static void main(String[] args) {
        int[] array = {4, 5, 6};
        System.out.println(Arrays.toString(array));
    }

    public static int[] makeLast(int[] nums) {
        int[] array = new int[(nums.length) * 2];
        array[array.length - 1] = nums[nums.length - 1];
        for (int i = 0; i < array.length - 2; i++) {
            array[i] = 0;
        }
        return array;
    }

}
