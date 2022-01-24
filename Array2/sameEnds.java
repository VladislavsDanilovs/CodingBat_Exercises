/*

Return true if the group of N numbers at the start and end of the array are the same. For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, and false for n=1 and n=3. You may assume that n is in the range 0..nums.length inclusive.

sameEnds([5, 6, 45, 99, 13, 5, 6], 1) → false
sameEnds([5, 6, 45, 99, 13, 5, 6], 2) → true
sameEnds([5, 6, 45, 99, 13, 5, 6], 3) → false

 */

package Array2;

import java.util.Arrays;

public class sameEnds {
    public static void main(String[] args) {
        int[] array = {};
        System.out.println(sameEnds(array, 0));
    }

    public static boolean sameEnds(int[] nums, int len) {
        boolean result = false;
        int[] startCounter = new int[nums.length];
        int[] endCounter = new int[nums.length];
        if (len == 0 && nums.length == 0) {
            return true;
        }
        if (nums.length < 1) {
            return false;
        }

        if (len == nums.length) {
            return true;
        }
        for (int i = 0; i < len; i++) {
            startCounter[i] = nums[i];
        }
        for (int i = nums.length - 1; i > nums.length - 1 - len; i--) {
            endCounter[nums.length - 1 - i] = nums[i];
        }
        if (endCounter[1] != 0) {
            int temp = endCounter[1];
            endCounter[1] = endCounter[0];
            endCounter[0] = temp;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (startCounter[i] != endCounter[i]) {
                result = false;
                break;
            } else {
                result = true;
            }
        }
        return result;
    }

}
