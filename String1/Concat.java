/*


Given two strings, append them together (known as "concatenation") and return the result.
However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".


conCat("abc", "cat") → "abcat"
conCat("dog", "cat") → "dogcat"
conCat("abc", "") → "abc"

 */

package String1;

public class Concat {
    public static void main(String[] args) {
        System.out.println(conCat("abc", "cat"));
    }

    public static String conCat(String a, String b) {
        if(a.length()<1){
            return b;
        }

        if(b.length()<1){
            return a;
        }

        if (a.charAt(a.length()-1)==b.charAt(0)){
            return a.substring(0,2)+b;
        }
        return a+b;
    }

}
