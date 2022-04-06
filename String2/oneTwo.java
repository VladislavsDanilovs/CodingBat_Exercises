/*

Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.


oneTwo("abc") → "bca"
oneTwo("tca") → "cat"
oneTwo("tcagdo") → "catdog"

 */

package String2;

public class oneTwo {
    public static void main(String[] args) {
        String str = "tcagdo";
        System.out.println(oneTwo(str));
    }

    public static String oneTwo(String str) {
        String result = "";
        String temp = "";

        for(int i=0; i<str.length()-2; i+=3){
            temp += str.substring(i, i+3);
            result+= temp.substring(i+1, i+3) + temp.charAt(i);
        }
        return result;
    }

}
