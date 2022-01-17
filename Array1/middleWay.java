/*
Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.

middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
 */

package Array1;

import java.util.Arrays;

public class middleWay {
    public static void main(String[] args) {
        int[] array1 = {1, 2 ,3};
        int[] array2 = {4, 5 ,6};
        System.out.println(Arrays.toString(middleWay(array1,array2)));
    }
    public static int[] middleWay(int[] a, int[] b) {
        int[] result = {a[1],b[1]};
        return result;
    }

}
