/*


Given a string and a non-empty substring sub,
compute recursively the largest substring which starts and ends with sub and return its length.


strDist("catcowcat", "cat") → 9
strDist("catcowcat", "cow") → 3
strDist("cccatcowcatxx", "cat") → 9

 */

package Recursion1;

public class StrDist {
    public static void main(String[] args) {
        System.out.println(strDist("cccatcowcatxx", "cat"));
    }

    public static int strDist(String str, String sub) {
        if (str.length() < sub.length()) {
            return 0;
        }

        if (str.length() == sub.length()) {
            return str.equals(sub) ? str.length() : 0;
        }

        int counter = 0;
        String firstPart = str.substring(0, sub.length());
        String lastPart = str.substring(str.length() - sub.length());

        if (firstPart.equals(sub) && lastPart.equals(sub)) {
            return str.length();
        }

        if (!firstPart.equals(sub) && lastPart.equals(sub)) {
            return strDist(str.substring(1), sub);
        }

        if (firstPart.equals(sub) && !lastPart.equals(sub)) {
            return strDist(str.substring(0, str.length() - 1), sub);
        }

        if (!firstPart.equals(sub) && !lastPart.equals(sub)) {
            return strDist(str.substring(1, str.length() - 1), sub);
        }

        return 0;
    }

}
