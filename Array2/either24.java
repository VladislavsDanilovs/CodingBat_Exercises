/*
Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.

either24([1, 2, 2]) → true
either24([4, 4, 1]) → true
either24([4, 4, 1, 2, 2]) → false
 */

package Array2;

public class either24 {
    public static void main(String[] args) {
        int[] array = {4, 4, 1};
        System.out.println(either24(array));

    }

    public static boolean either24(int[] nums) {
        boolean result = false;
        int counterTwo = 0;
        int counterFour = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == 2 && nums[i] == 2) {
                result = true;
                counterTwo++;
            } else if (nums[i - 1] == 4 && nums[i] == 4) {
                result = true;
                counterFour++;
            }
        }
        result = (counterTwo > 0 && counterFour > 0) ? false : result;
        return result;
    }


}
