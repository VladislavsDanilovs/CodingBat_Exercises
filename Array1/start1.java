/*

Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.

start1([1, 2, 3], [1, 3]) → 2
start1([7, 2, 3], [1]) → 1
start1([1, 2], []) → 1
 */

package Array1;

public class start1 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 3};
        System.out.println(start1(array1, array2));
    }

    public static int start1(int[] a, int[] b) {
        int counter = 0;
        if (a.length != 0) {
            if (a[0] == 1) {
                counter++;
            }
        }
        if (b.length != 0) {
            if (b[0] == 1) {
                counter++;
            }
        }
        return counter;
    }

}
