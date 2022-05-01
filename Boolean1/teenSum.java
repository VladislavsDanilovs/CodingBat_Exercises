/*

Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are extra lucky. So if either value is a teen, just return 19.


teenSum(3, 4) → 7
teenSum(10, 13) → 19
teenSum(13, 2) → 19
 */

package Boolean1;

public class teenSum {
    public static void main(String[] args) {
        System.out.println(teenSum(3, 4));
    }

    public static int teenSum(int a, int b) {
        int result = 0;
        result = (a >= 13 && a <= 19 || b >= 13 && b <= 19) ? 19 : a + b;
        return result;
    }
}
