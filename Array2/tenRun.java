/*

For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.

tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]

 */

package Array2;

import java.util.Arrays;

public class tenRun {
    public static void main(String[] args) {
        int[] array = new int[]{2, 10, 3, 4, 20, 5};
        System.out.println(Arrays.toString(tenRun(array)));

        System.out.println(10 % 10);
    }

    public static int[] tenRun(int[] nums) {
        int change = 0;
        boolean condition = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                change = nums[i];
                condition = true;
            }
            if (condition) {
                nums[i] = change;
            }
        }
        return nums;
    }

}
