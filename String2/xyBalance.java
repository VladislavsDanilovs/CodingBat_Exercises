/*

We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.

xyBalance("aaxbby") → true
xyBalance("aaxbb") → false
xyBalance("yaaxbb") → false

 */

package String2;

public class xyBalance {
    public static void main(String[] args) {
        String str = "aaxbby";
        System.out.println(xyBalance(str));
    }
    public static boolean xyBalance(String str) {
        boolean result = false;
        int xLast = str.lastIndexOf('x');
        int yLast = str.lastIndexOf('y');

        if(xLast <= yLast){
            result = true;
        }
        return result;
    }

}
