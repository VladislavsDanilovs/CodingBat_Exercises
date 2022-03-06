/*

Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.


endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true

 */

package String2;

public class endOther {
    public static void main(String[] args) {
        String str1 = "Hiabc";
        String str2 = "abc";
        System.out.println(endOther(str1, str2));
    }

    public static boolean endOther(String a, String b) {
        boolean result = false;

        if (b.toLowerCase().endsWith(a.toLowerCase())
                || a.toLowerCase().endsWith(b.toLowerCase())) {
            result = true;
        }

        return result;
    }

}
