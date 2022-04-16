/*


Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38 and 39 return true, but 40 returns false. See also: Introduction to Mod


less20(18) → true
less20(19) → true
less20(20) → false

 */

package Boolean1;

public class less20 {
    public static void main(String[] args) {
        int number = 20;
        System.out.println(less20(number));
    }

    public static boolean less20(int n) {
        boolean result = false;
        if (n % 20 == 18 || n % 20 == 19) {
            result = true;
        }
        return result;
    }

}
