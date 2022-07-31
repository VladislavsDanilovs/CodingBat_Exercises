/*

Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.

countX("xxhixx") → 4
countX("xhixhix") → 3
countX("hi") → 0

 */

package Recursion1;

public class CountX {
    public static void main(String[] args) {
        String str = "xxhixx";
        System.out.println(countX(str));
    }

    public static int countX(String str) {
        if (str.length() == 0) {
            return 0;
        }

        if (str.charAt(str.length() - 1) == 'x') {
            return 1 + countX(str.substring(0, str.length() - 1));
        }

        return countX(str.substring(0, str.length() - 1));
    }

}
