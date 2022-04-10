/*

Return true if the given non-negative number is 1 or 2 more than a multiple of 20. See also: Introduction to Mod


more20(20) → false
more20(21) → true
more20(22) → true

 */

package Boolean1;

public class more20 {
    public static void main(String[] args) {
        int number = 20;
        System.out.println(more20(number));
    }
    public static boolean more20(int n) {
        boolean result = false;

        if(n%20 == 1 || n%20 ==2 ){
            result = true;
        }
        return result;
    }
}
