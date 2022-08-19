/*

Given a string, compute recursively a new string where all the lowercase 'x'
chars have been moved to the end of the string.


endX("xxre") → "rexx"
endX("xxhixx") → "hixxxx"
endX("xhixhix") → "hihixxx"

 */

package Recursion1;

public class EndX {
    public static void main(String[] args) {
        System.out.println(endX("xxre"));
    }
    public static String endX(String str) {
        if(str.length()<=1){
            return str;
        }
        String firstLetter = str.substring(0,1);
        if (firstLetter.equals("x")){
            return endX(str.substring(1))+firstLetter;
        }
        return firstLetter+endX(str.substring(1));
    }
}
