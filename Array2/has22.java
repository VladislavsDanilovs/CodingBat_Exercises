/*
Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.

has22([1, 2, 2]) → true
has22([1, 2, 1, 2]) → false
has22([2, 1, 2]) → false

 */

package Array2;

public class has22 {
    public static void main(String[] args) {
        int[] array = {1, 2, 2};
        System.out.println(has22(array));
    }

    public static boolean has22(int[] nums) {
        boolean result = false;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == 2 && nums[i] == 2) {
                result = true;
                break;
            }
        }
        return result;
    }

}
