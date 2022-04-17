/*

Given a non-negative number "num", return true if num is within 2 of a multiple of 10. Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2. See also: Introduction to Mod


nearTen(12) → true
nearTen(17) → false
nearTen(19) → true

 */

package Boolean1;

public class nearTen {
    public static void main(String[] args) {
        int number = 12;
        System.out.println(nearTen(number));
    }
    public static boolean nearTen(int num) {
        boolean result = false;
        if(num % 10 == 9 || num % 10 == 8 || num % 10 == 1
                || num % 10 ==2 || num % 10 == 0 ){
            result = true;
        }
        return result;
    }

}
