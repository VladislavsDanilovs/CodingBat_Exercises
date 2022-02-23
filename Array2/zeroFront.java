
/*

Return an array that contains the exact same numbers as the given array, but rearranged so that all the zeros are grouped at the start of the array. The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. You may modify and return the given array or make a new array.


zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
zeroFront([1, 0]) → [0, 1]

 */

package Array2;

import java.util.Arrays;

public class zeroFront {
    public static void main(String[] args) {
        int[] array = {1, 0, 0, 1};
        System.out.println(Arrays.toString(zeroFront(array)));
    }

    public static int[] zeroFront(int[] nums) {
        int[] result = new int[nums.length];
        int index = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {

                result[index] = nums[i];
                index--;
            }
        }

        return result;
    }

}
