/*
Given an array of ints, return true if every element is a 1 or a 4.

only14([1, 4, 1, 4]) → true
only14([1, 4, 2, 4]) → false
only14([1, 1]) → true

 */
package Array2;

public class only14 {
    public static void main(String[] args) {
        int[]array = {1,4,2,4};
        System.out.println(only14(array));
    }

    public static boolean only14(int[] nums) {
        boolean result = false;
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 4) {
                counter++;
            }
        }
        result = (counter == nums.length) ? true : false;
        return result;
    }

}
