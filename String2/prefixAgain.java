/*

Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().


prefixAgain("abXYabc", 1) → true
prefixAgain("abXYabc", 2) → true
prefixAgain("abXYabc", 3) → false
Go...Sa

 */

package String2;

public class prefixAgain {
    public static void main(String[] args) {
        String str = "abXYabc";
        int n = 3;
        System.out.println(prefixAgain(str, n));
    }

    public static boolean prefixAgain(String str, int n) {
        boolean result = false;
        String temp = "";
        temp = temp + str.substring(0, n);
        if (str.length() == 2 && str.charAt(0) == str.charAt(1)) {
            result = true;
        }
        for (int i = 1; i < str.length() - n; i++) {
            if (str.substring(i, i + n).equals(temp)) {
                result = true;
            }
        }
        return result;
    }

}
