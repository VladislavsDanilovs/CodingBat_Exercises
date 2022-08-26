/*


Given a string, return recursively a "cleaned" string where adjacent chars that are the same have been reduced
to a single char. So "yyzzza" yields "yza".


stringClean("yyzzza") → "yza"
stringClean("abbbcdd") → "abcd"
stringClean("Hello") → "Helo"

 */

package Recursion1;

public class StringClean {
    public static void main(String[] args) {
        System.out.println(stringClean("abbbcdd"));
    }

    public static String stringClean(String str) {
        if(str.length()<2){
            return str;
        }
        String secondLetter = str.substring(1,2);
        String firstLetter = str.substring(0,1);

        if(firstLetter.equals(secondLetter)){
            return stringClean(str.substring(1));
        }
        return firstLetter+stringClean(str.substring(1));
    }


}
