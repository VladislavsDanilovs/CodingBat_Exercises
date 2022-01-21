/*
Given an array of ints, return true if the array contains no 1's and no 3's.

lucky13([0, 2, 4]) → true
lucky13([1, 2, 3]) → false
lucky13([1, 2, 4]) → false
 */

package Array2;

public class lucky13 {
    public static void main(String[] args) {
        int[] array = {0, 2, 4};
        System.out.println(lucky13(array));
    }

    public static boolean lucky13(int[] nums) {
        boolean result = false;
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3) {
                counter++;
            }
        }
        result = counter > 0 ? false : true;
        return result;
    }


}
