/*

Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.

changeXY("codex") → "codey"
changeXY("xxhixx") → "yyhiyy"
changeXY("xhixhix") → "yhiyhiy"

 */

package Recursion1;

public class ChangeXY {
    public static void main(String[] args) {
        String str = "codex";
        System.out.println(changeXY(str));
        System.out.println("a" + str);
    }

    public static String changeXY(String str) {
        if (str.length() == 0) {
            return "";
        }

        String firstLetter = str.substring(0, 1);
        String substring = str.substring(1);

        if (firstLetter.equals("x")) {
            return "y" + changeXY(substring);
        }

        return firstLetter + changeXY(substring);
    }

}
