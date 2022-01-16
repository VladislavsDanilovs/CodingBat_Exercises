/*
Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.

noTriples([1, 1, 2, 2, 1]) → true
noTriples([1, 1, 2, 2, 2, 1]) → false
noTriples([1, 1, 1, 2, 2, 2, 1]) → false

 */

package warmup2;

public class noTriples {
    public static void main(String[] args) {
        int[]array = {1,1,2,2,1};
        System.out.println(noTriples(array));
    }

    public static boolean noTriples(int[] nums) {
        boolean tripleCheck = true;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i - 2] == nums[i - 1] && nums[i - 2] == nums[i]) {
                tripleCheck = false;
            }
        }
        return tripleCheck;
    }

}
