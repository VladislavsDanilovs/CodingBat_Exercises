/*
Given an int array length 2, return true if it does not contain a 2 or 3.

no23([4, 5]) → true
no23([4, 2]) → false
no23([3, 5]) → false
 */

package Array1;

public class no23 {
    public static void main(String[] args) {
        int[] array = {4, 5};
        System.out.println(no23(array));
    }

    public static boolean no23(int[] nums) {
        boolean result = false;
        result = (nums[0] != 2 && nums[0] != 3 && nums[1] != 2 && nums[1] != 3);
        return result;
    }
}
