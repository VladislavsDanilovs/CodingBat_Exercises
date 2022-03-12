/*

Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.


bobThere("abcbob") → true
bobThere("b9b") → true
bobThere("bac") → false

 */

package String2;

public class bobThere {
    public static void main(String[] args) {
        String str = "abcbob";
        System.out.println(bobThere(str));
    }

    public static boolean bobThere(String str) {
        boolean result = false;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.length() >= 3) {
                if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                    result = true;
                }
            } else {
                result = false;
            }
        }
        return result;
    }

}
