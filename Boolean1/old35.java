/*

Return true if the given non-negative number is a multiple of 3 or 5, but not both. Use the % "mod" operator -- see Introduction to Mod


old35(3) → true
old35(10) → true
old35(15) → false

 */

package Boolean1;

public class old35 {
    public static void main(String[] args) {
        int number = 3;
        System.out.println(old35(number));
    }
    public static boolean old35(int n) {
        boolean result = false;
        if (n % 3 == 0 && n % 5 == 0){
            return false;
        }
        if (n % 3 == 0 || n % 5 == 0){
            result = true;
        }
        return result;
    }

}
