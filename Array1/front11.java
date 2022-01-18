/*

Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. If either array is length 0, ignore that array.

front11([1, 2, 3], [7, 9, 8]) → [1, 7]
front11([1], [2]) → [1, 2]
front11([1, 7], []) → [1]

 */

package Array1;

import java.util.Arrays;

public class front11 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {7, 9, 8};
        System.out.println(Arrays.toString(front11(array1, array2)));
    }

    public int[] front11(int[] a, int[] b) {
        int aLength = a.length;
        int bLength = b.length;
        int[] result = new int[aLength + bLength];

        if (bLength == 0 && aLength == 0) {
            result = new int[]{};
        } else if (aLength == 0) {
            result = new int[]{b[0]};
        } else if (bLength == 0) {
            result = new int[]{a[0]};
        } else {
            result = new int[]{a[0], b[0]};
        }
        return result;
    }

}
