/*
Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.

firstLast6([1, 2, 6]) → true
firstLast6([6, 1, 2, 3]) → true
firstLast6([13, 6, 1, 2, 3]) → false
 */

package Array1;

public class firstLast6 {
    public static void main(String[] args) {
        int[] array = {1, 2, 6};
        System.out.println(firstLast6(array));
    }

    public static boolean firstLast6(int[] nums) {
        boolean result = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[0] == 6 || nums[nums.length - 1] == 6) {
                result = true;
                break;
            }
        }
        return result;
    }

}
