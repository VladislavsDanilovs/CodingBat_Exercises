/*

Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".

changePi("xpix") → "x3.14x"
changePi("pipi") → "3.143.14"
changePi("pip") → "3.14p"

 */

package Recursion1;

public class ChangePi {
    public static void main(String[] args) {
        String str = "xpix";
        System.out.println(changePi(str));
    }

    public static String changePi(String str) {
        if (str.length() < 2) {
            return str;
        }
        String firstTwoLetters = str.substring(0, 2);

        if (firstTwoLetters.equals("pi")) {
            firstTwoLetters = "3.14";
            return firstTwoLetters + changePi(str.substring(2));
        }
        return str.charAt(0) + changePi(str.substring(1));
    }

}
