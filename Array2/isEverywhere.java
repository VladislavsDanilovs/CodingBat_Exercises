/*

We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array, at least one of the pair is that value. Return true if the given value is everywhere in the array.

isEverywhere([1, 2, 1, 3], 1) → true
isEverywhere([1, 2, 1, 3], 2) → false
isEverywhere([1, 2, 1, 3, 4], 1) → false

 */

package Array2;

public class isEverywhere {
    public static void main(String[] args) {
        int[] array = {2, 1, 2, 2, 2, 1, 2, 1};
        System.out.println(isEverywhere(array, 2));
    }

    public static boolean isEverywhere(int[] nums, int val) {
        boolean result = true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != val && nums[i] != val) {
                result = false;
            }
        }
        return result;
    }

}
