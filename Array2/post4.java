/*

Given a non-empty array of ints, return a new array containing the elements from the original array that come after the last 4 in the original array. The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.


post4([2, 4, 1, 2]) → [1, 2]
post4([4, 1, 4, 2]) → [2]
post4([4, 4, 1, 2, 3]) → [1, 2, 3]


 */


package Array2;

import java.util.Arrays;

public class post4 {
    public static void main(String[] args) {
        int[] array1 = {2, 4, 1, 2};
        int[] array2 = {2, 4, 1, 4, 3, 2};
//        System.out.println(Arrays.toString(post4(array1)));
        System.out.println(Arrays.toString(post4(array2)));
    }

    public static int[] post4(int[] nums) {
        int counter = 0;

        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] == 4) {
                break;
            }
            counter++;
        }
        int[] result = new int[counter];
        for (int i = 0; i < result.length; i++) {
            result[i] = nums[i + nums.length - result.length];
        }
        return result;
    }

}
