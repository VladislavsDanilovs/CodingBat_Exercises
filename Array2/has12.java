/*

Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.


has12([1, 3, 2]) → true
has12([3, 1, 2]) → true
has12([3, 1, 4, 5, 2]) → true

 */

package Array2;

public class has12 {
    public static void main(String[] args) {
        int[] array = {3, 2};
        System.out.println(has12(array));
    }

    public static boolean has12(int[] nums) {
        boolean result = false;
        int indexOne = 0;
        int indexTwo = 0;
        for (int i = 0; i < nums.length; i++) {
            indexOne = (nums[i] == 1) ? i : indexOne;
            indexTwo = (nums[i] == 2) ? i : indexTwo;
        }
        indexOne = nums.length == 2 ? nums[0] != 1 ? indexTwo + 1 : indexOne : indexOne;
        result = indexOne < indexTwo ? true : false;
        return result;
    }
}
