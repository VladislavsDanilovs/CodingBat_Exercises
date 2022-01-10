/*
Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.


arrayFront9([1, 2, 9, 3, 4]) → true
arrayFront9([1, 2, 3, 4, 9]) → false
arrayFront9([1, 2, 3, 4, 5]) → false
 */
package warmup2;

public class arrayFront9 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 4, 3, 5};
        System.out.println(arrayFront9(array1));
    }

    public static boolean arrayFront9(int[] nums) {
        boolean result = false;
        if (nums.length < 4) {
            result = false;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i != 4) {
                if (nums[i] == 9) {
                    result = true;
                }
            }
        }
        return result;
    }

}

/*
alternative solution

    int size = nums.length < 4 ? nums.length : 4;
    boolean result = false;
    for(int i=0; i<size ; i++) {
    if(nums[i] == 9) {
    result = true;
    break;
     }
    }
    return result;
    }

 */


