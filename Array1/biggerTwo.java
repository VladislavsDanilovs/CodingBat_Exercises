/*
Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. Return the array which has the largest sum. In event of a tie, return a.

biggerTwo([1, 2], [3, 4]) → [3, 4]
biggerTwo([3, 4], [1, 2]) → [3, 4]
biggerTwo([1, 1], [1, 2]) → [1, 2]
 */
package Array1;

import java.util.Arrays;

public class biggerTwo {
    public static void main(String[] args) {
        int[] array1 = {1, 2};
        int[] array2 = {3, 4};
        System.out.println(Arrays.toString(biggerTwo(array1, array2)));
    }

    public static int[] biggerTwo(int[] a, int[] b) {
        int[] result = (((a[0] + a[1]) > (b[0] + b[1])) | (a[0] + a[1]) == (b[0] + b[1])) ? new int[]{a[0], a[1]} : new int[]{b[0], b[1]};
        return result;
    }

}
