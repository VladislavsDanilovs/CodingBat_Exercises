/*

Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.

endUp("Hello") → "HeLLO"
endUp("hi there") → "hi thERE"
endUp("hi") → "HI"

 */

public class endUp {

    public static void main(String[] args) {
        System.out.println(endUp("Hello"));
    }
    public static String endUp(String str) {
        String result="";
        if(str.length()>3){
            String last3Letters = str.substring(str.length()-3, str.length());
            String upper3Letters= last3Letters.toUpperCase();
            String firstLetters = str.substring(0, str.length()-3);
            result = firstLetters+upper3Letters;
        }
        else if(str.length()<3){
            result = str.toUpperCase();
        }
        return result;
    }
}
