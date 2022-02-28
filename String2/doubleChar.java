/*

Given a string, return a string where for every char in the original, there are two chars.


doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"

 */

package String2;

public class doubleChar {
    public static void main(String[] args) {
        String str = "The";

        System.out.println(doubleChar(str));
    }

    public static String doubleChar(String str) {
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            temp = temp + str.charAt(i) + str.charAt(i);
        }
        return temp;
    }

}
