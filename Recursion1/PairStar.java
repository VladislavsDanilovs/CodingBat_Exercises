/*


Given a string, compute recursively a new string where identical chars that are adjacent in the original
string are separated from each other by a "*".


pairStar("hello") → "hel*lo"
pairStar("xxyy") → "x*xy*y"
pairStar("aaaa") → "a*a*a*a"
 */

package Recursion1;

public class PairStar {
    public static void main(String[] args) {
        System.out.println(pairStar("hello"));
    }
    public static String pairStar(String str) {
        if (str.length() == 0) {
            return str;
        }

        if (str.length() == 1 ) {
            return str;
        }
        String firstLetter = str.substring(0, 1);

        if ( firstLetter.equals(str.substring(1,2))){
            return firstLetter+"*"+pairStar(str.substring(1));
        }

        return firstLetter+pairStar(str.substring(1));
    }
}
