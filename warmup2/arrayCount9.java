/*

Given an array of ints, return the number of 9's in the array.

arrayCount9([1, 2, 9]) → 1
arrayCount9([1, 9, 9]) → 2
arrayCount9([1, 9, 9, 3, 9]) → 3
 */
package warmup2;

public class arrayCount9 {
    public static void main(String[] args) {
        int[]array1={1,2,4,9};
        System.out.println(arrayCount9(array1));
    }
    public static int arrayCount9(int[] nums) {
        int counter = 0;
        for(int i =0; i<nums.length; i++){
            if(nums[i] == 9){
                counter++;
            }
        }
        return counter;
    }

}
