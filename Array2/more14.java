/*
Given an array of ints, return true if the number of 1's is greater than the number of 4's

more14([1, 4, 1]) → true
more14([1, 4, 1, 4]) → false
more14([1, 1]) → true
 */

package Array2;

public class more14 {
    public static void main(String[] args) {
        int[] array = {1, 4, 1};
        System.out.println(more14(array));
    }

    public static boolean more14(int[] nums) {
        boolean result = false;
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            counter = (nums[i] == 1) ? counter+1 : (nums[i] == 4) ? counter-1 : counter;
        }
        result = counter < 0 || counter == 0 ? false : true;
        return result;
    }

}
