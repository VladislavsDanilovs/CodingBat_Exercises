/*

Given a string, return true if it is a nesting of zero or more pairs of parenthesis, like "(())" or "((()))".
Suggestion: check the first and last chars, and then recur on what's inside them.


nestParen("(())") → true
nestParen("((()))") → true
nestParen("(((x))") → false

 */

package Recursion1;

public class NestParen {
    public static void main(String[] args) {
        System.out.println(nestParen("((()))"));
    }
    public static boolean nestParen(String str) {
        if (str.length() <1) {
            return true;
        }

        char firstLetter = str.charAt(0);
        char lastLetter = str.charAt(str.length()-1);


        if(str.length()==2 && firstLetter == '(' && lastLetter == ')'){
            return true;
        }

        if(firstLetter == '(' && lastLetter == ')'){
            return nestParen(str.substring(1, str.length()-1));
        }


        return false;
    }
}
