/*

Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".

doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true

 */

package warmup2;

public class doubleXX {
    public static void main(String[] args) {
        System.out.println(doubleX("axxbb"));
    }
    static boolean doubleX(String str) {
        boolean result = false;
        if (str.length() < 2) {
            result = false;
        }
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == 'x') {
                if (str.charAt(i - 1) == 'x' & str.charAt(i) == 'x') {
                    result = true;
                    break;
                }
                if (str.charAt(i - 1) == 'x' & str.charAt(i) != 'x') {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

}
