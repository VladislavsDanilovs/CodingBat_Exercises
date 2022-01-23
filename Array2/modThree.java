/*

Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.

modThree([2, 1, 3, 5]) → true
modThree([2, 1, 2, 5]) → false
modThree([2, 4, 2, 5]) → true

 */

package Array2;

public class modThree {
    public static void main(String[] args) {
        int[] array = {2, 1, 3, 5};
        System.out.println(modThree(array));
        System.out.println(1 % 2);
    }

    public static boolean modThree(int[] nums) {
        boolean result = false;
        int oddCounter = 0;
        int evenCounter = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0) {
                evenCounter++;
            } else if (nums[i] % 2 != 0 && nums[i + 1] % 2 != 0 && nums[i + 2] % 2 != 0) {
                oddCounter++;
            }
        }
        if (oddCounter > 0) {
            result = true;
        }
        if (evenCounter > 0) {
            result = true;
        }
        return result;
    }
}
