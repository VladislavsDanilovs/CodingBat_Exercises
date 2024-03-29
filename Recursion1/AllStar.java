package Recursion1;

/*

Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".


allStar("hello") → "h*e*l*l*o"
allStar("abc") → "a*b*c"
allStar("ab") → "a*b"

 */

public class AllStar {
    public static void main(String[] args) {
        System.out.println(allStar("hello"));
    }

    public static String allStar(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return str;
        }
        String firstLetter = str.substring(0, 1) + "*";

        return firstLetter + allStar(str.substring(1));
    }

}
