/*


Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
The string may be any length. If there are fewer than 2 chars, use whatever is there.


extraFront("Hello") → "HeHeHe"
extraFront("ab") → "ababab"
extraFront("H") → "HHH"

 */

package String1;

public class ExtraFront {
    public static void main(String[] args) {
        System.out.println(extraFront("Hello"));
    }
    public static String extraFront(String str) {
        if (str.length()>= 2){
            String firstTwoLetters = str.substring(0, 2);
            return firstTwoLetters+firstTwoLetters+firstTwoLetters;
        }
        return str+str+str;
    }

}
