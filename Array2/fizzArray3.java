/*

Given start and end numbers, return a new array containing the sequence of integers from start up to but not including end, so start=5 and end=10 yields {5, 6, 7, 8, 9}. The end number will be greater or equal to the start number. Note that a length-0 array is valid. (See also: FizzBuzz Code)


fizzArray3(5, 10) → [5, 6, 7, 8, 9]
fizzArray3(11, 18) → [11, 12, 13, 14, 15, 16, 17]
fizzArray3(1, 3) → [1, 2]

 */

package Array2;

import java.util.Arrays;

public class fizzArray3 {
    public static void main(String[] args) {
        int start = 5;
        int end = 10;
        System.out.println(Arrays.toString(fizzArray3(start, end)));
    }

    public static int[] fizzArray3(int start, int end) {
        int[] result = new int[end - start];
        for (int i = 0; i < result.length; i++) {
            result[i] = start + i;
        }
        return result;
    }

}


//Another solution
//int[] result = new int[end - start];
//
//        if(start == 1 && end == 1){
//                return result;
//                }
//
//                if (start >= 1 && end >= 1) {
//                for (int i = start; i < end; i++) {
//        result[i - start] = i;
//        }
//        }
//        return result;