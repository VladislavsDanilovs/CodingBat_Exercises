/*
Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value. Use int division to produce the final average. You may assume that the array is length 3 or more.

centeredAverage([1, 2, 3, 4, 100]) → 3
centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
centeredAverage([-10, -4, -2, -4, -2, 0]) → -3

 */

package Array2;

public class centeredAverage {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 100};
        System.out.println(centeredAverage(array));
    }

    public static int centeredAverage(int[] nums) {
        int result = 0;
        int max = nums[0];
        int min = nums[0];
        int sum = 0;
        if (nums.length > 3) {
            for (int i = 0; i < nums.length; i++) {
                max = Math.max(max, nums[i]);
                min = Math.min(min, nums[i]);
                sum += nums[i];
            }
            result = (sum - max - min) / (nums.length - 2);
        } else {
            for (int i = 0; i < nums.length; i++) {
                max = Math.max(max, nums[i]);
                min = Math.min(min, nums[i]);
                sum += nums[i];
                result = sum - max - min;
            }
        }
        return result;
    }

}
