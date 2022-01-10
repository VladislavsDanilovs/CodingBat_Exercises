/*
Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.


array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true

 */

package warmup2;

public class array123 {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 4, 1};
        System.out.println(array123(array));
    }

    public static boolean array123(int[] nums) {
        boolean result = false;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i - 2] == 1 && nums[i - 1] == 2 && nums[i] == 3) {
                result = true;
                break;
            }
        }
        return result;
    }

}
