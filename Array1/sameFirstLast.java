/*
Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.

sameFirstLast([1, 2, 3]) → false
sameFirstLast([1, 2, 3, 1]) → true
sameFirstLast([1, 2, 1]) → true
 */

package Array1;

public class sameFirstLast {
    public static void main(String[] args) {
        int[] array2 = {7};
        System.out.println(array2.length);
        int[] array = {1, 2, 3};
        System.out.println(sameFirstLast(array));
    }

    public static boolean sameFirstLast(int[] nums) {
        boolean result = false;
        result = (nums.length != 0) ? (nums[0] == nums[nums.length - 1]) ? true : false : false;
        return result;
    }

}
