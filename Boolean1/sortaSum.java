/*

Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.


sortaSum(3, 4) → 7
sortaSum(9, 4) → 20
sortaSum(10, 11) → 21

 */

package Boolean1;

public class sortaSum {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.println(sortaSum(a, b));
    }
    public static int sortaSum(int a, int b) {
        int result = 0;
        result = a + b;
        result = (result >= 10 && result <=19)  ? 20 : result;
        return result;
    }

}
