/*


Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".


firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"

 */

package String1;

public class FirstHalf {
    public static void main(String[] args) {
        String str = "WooHoo";
        System.out.println(firstHalf(str));
    }
    public static String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

}
