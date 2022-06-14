/*

Given three ints, a b c, return true if b is greater than a, and c is greater than b. However, with the exception that if "bOk" is true, b does not need to be greater than a.

inOrder(1, 2, 4, false) → true
inOrder(1, 2, 1, false) → false
inOrder(1, 1, 2, true) → true

 */

package Boolean1;

public class InOrder {
    public static void main(String[] args) {
        System.out.println(inOrder(1, 2, 4, false));
    }
    public static boolean inOrder(int a, int b, int c, boolean bOk) {
        boolean result = false;
        result = (bOk) ? ((c > b) ? true : false) : (b > a && c > b) ? true : false;
        return result;
    }

}