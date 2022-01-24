/*

Given an array of ints, return true if every 2 that appears in the array is next to another 2.


twoTwo([4, 2, 2, 3]) → true
twoTwo([2, 2, 4]) → true
twoTwo([2, 2, 4, 2]) → false

 */

package Array2;

public class twoTwo {
    public static void main(String[] args) {
        int[] array = {4, 2, 2, 3};
        System.out.println(twoTwo(array));
    }

    public static boolean twoTwo(int[] nums) {
        boolean result = false;
        switch (nums.length) {
            case 1:
                result = nums[0] == 2 ? false : true;
                break;
            case 2:
                result = nums[0] == 2 && nums[1] == 2 ? true : false;
                break;
            case 0:
                result = true;
                break;
            default:
                result = false;
                break;
        }
        for (int i = 0; i < nums.length - 2; i++) {
            result = (nums[i] == 2 && nums[i + 1] != 2 && nums[i + 2] == 2) ? false : (nums[i] == 2 && nums[i + 1] == 2)
                    ? true : (nums[i] != 2 && nums[i + 2] != 2 && nums[i + 1] != 2) ? true : result;
        }
        return result;
    }
}
