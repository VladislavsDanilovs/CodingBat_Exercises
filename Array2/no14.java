/*

Given an array of ints, return true if it contains no 1's or it contains no 4's.

no14([1, 2, 3]) → true
no14([1, 2, 3, 4]) → false
no14([2, 3, 4]) → true

 */
package Array2;

public class no14 {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        System.out.println(no14(array));
    }
    public static boolean no14(int[] nums) {
        boolean result = false;
        int one = 0;
        int four = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                one++;
            }
            else if(nums[i] == 4){
                four++;
            }
        }
        result = (one > 0 && four > 0) ? false : true;
        return result;
    }

}
