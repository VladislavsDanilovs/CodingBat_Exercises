/*

Return an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers. Other than that, the numbers can be in any order. You may modify and return the given array, or make a new array.

evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
evenOdd([3, 3, 2]) → [2, 3, 3]
evenOdd([2, 2, 2]) → [2, 2, 2]

 */


package Array2;

import java.util.Arrays;

public class evenOdd {
    public static void main(String[] args) {
        int[] array = {1, 0, 1, 0, 0, 1, 1};
        System.out.println(Arrays.toString(evenOdd(array)));
        System.out.println(0 % 2);
    }

    public static int[] evenOdd(int[] nums) {
        int[] temp = new int[nums.length];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            temp[i] = nums[i];
        }
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] % 2 == 0) {
                nums[index] = temp[i];
                index++;
            }
        }
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] % 2 != 0) {
                nums[index] = temp[i];
                index++;
            }
        }

        return nums;
    }

}
