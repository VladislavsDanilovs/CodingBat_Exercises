/*

Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.


double23([2, 2]) → true
double23([3, 3]) → true
double23([2, 3]) → false

 */
package Array1;

public class double23 {
    public static void main(String[] args) {
        int[]array = {2,2};
        System.out.println(double23(array));
    }

    public static boolean double23(int[] nums) {
        boolean result = false;
        result = (nums.length > 1 && (nums[0] == 2 && nums[nums.length - 1] == 2) |
                (nums.length > 1 && nums[0] == 3 && nums[nums.length - 1] == 3)) ? true : false;
        if (nums.length == 1) {
            result = false;
        }
        return result;
    }

}
