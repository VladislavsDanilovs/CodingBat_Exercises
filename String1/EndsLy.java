/*

Given a string, return true if it ends in "ly".

endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false

 */

package String1;

public class EndsLy {
    public static void main(String[] args) {
        System.out.println(endsLy("oddly"));
    }

    public static boolean endsLy(String str) {
        if (str.length() <= 1) {
            return false;
        }
        return str.substring(str.length() - 2).equals("ly");
    }
}
