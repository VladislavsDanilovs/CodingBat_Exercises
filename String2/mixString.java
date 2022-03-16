/*

Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.


mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"

 */

package String2;

public class mixString {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "xyz";
        System.out.println(mixString(str1, str2));
    }

    public static String mixString(String a, String b) {
        String temp = a.length() > b.length() ? a : b;
        String result = "";
        for (int i = 0; i < temp.length(); i++) {
            if (i == a.length() || i == b.length()) {
                result = result + temp.substring(i, temp.length());
                break;
            }
            result = result + a.charAt(i) + b.charAt(i);
        }
        return result;
    }

}
