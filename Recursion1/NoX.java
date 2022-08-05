/*

Given a string, compute recursively a new string where all the 'x' chars have been removed.

noX("xaxb") → "ab"
noX("abc") → "abc"
noX("xx") → ""

 */

package Recursion1;

public class NoX {
    public static void main(String[] args) {
        String str = "xaxb";
        System.out.println(noX(str));
    }

    public static String noX(String str) {
        if (str.length() == 0) {
            return "";
        }
        String f = ""+ str.charAt(0);
        if(f.equals("x")){
            return noX(str.substring(1));
        }
        return f+noX(str.substring(1));
    }

}
