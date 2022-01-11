/*

Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.

stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0

 */

package warmup2;

public class stringMatch {
    public static void main(String[] args) {
        System.out.println(stringMatch("xxcaazz", "xxbaaz"));
    }

    public static int stringMatch(String a, String b) {
        int result = 0;
        if (a != "" & b != "") {
            int biggerString = a.length() > b.length() ? a.length() : b.length();
            for (int i = 1; i < biggerString; i++) {
                if (i == a.length() || i == b.length()) {
                    break;
                }
                if (a.charAt(i - 1) == b.charAt(i - 1) && a.charAt(i) == b.charAt(i)) {
                    result++;
                }
            }
        }
        return result;
    }

}
