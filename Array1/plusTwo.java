/*
Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.

plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
 */

package Array1;

import java.util.Arrays;

public class plusTwo {
    public static void main(String[] args) {
        int[] array1 = new int[]{1,2};
        int[] array2 = new int[]{3,4};
        System.out.println(Arrays.toString(plusTwo(array1,array2)));
    }
    public static int[] plusTwo(int[] a, int[] b) {
        int[]result;
        result = new int[]{a[0],a[1],b[0],b[1]};
        return result;
    }

}
