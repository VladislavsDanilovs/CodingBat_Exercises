/*

Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.

xyzThere("abcxyz") → true
xyzThere("abc.xyz") → false
xyzThere("xyz.abc") → true

 */

package String2;

public class xyzThere {
    public static void main(String[] args) {

        String str = "xyz.abc";
        System.out.println(xyzThere(str));
    }

    public static boolean xyzThere(String str) {
        boolean result = false;
        if(str.startsWith("xyz")){
            result = true;
            return result;
        }
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("xyz")) {
                result = true;
            }
            if(result ){
                result = str.charAt(i-1) != '.' ? result : false;
            }
        }
        return result;
    }
}
