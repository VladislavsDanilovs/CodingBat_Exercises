/*
Given an array of ints, return true if the array contains two 7's next to each other, or there are two 7's separated by one element, such as with {7, 1, 7}.

has77([1, 7, 7]) → true
has77([1, 7, 1, 7]) → true
has77([1, 7, 1, 1, 7]) → false
 */

package Array2;

public class has77 {
    public static void main(String[] args) {
        int[] array = {1, 7, 7};
        System.out.println(has77(array));
    }

    public static boolean has77(int[] nums) {
        boolean result = false;
        if (nums.length > 1) {
            for (int i = 1; i < nums.length; i++) {
                if ((nums[i - 1] == 7 && nums[i] == 7)) {
                    result = true;
                    break;
                }
            }
            for (int i = 0; i < nums.length - 2; i++) {
                if ((nums[i] == 7 && nums[i + 2] == 7)) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}
