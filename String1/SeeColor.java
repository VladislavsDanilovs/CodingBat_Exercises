/*

Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.

seeColor("redxx") → "red"
seeColor("xxred") → ""
seeColor("blueTimes") → "blue"

 */

package String1;

public class SeeColor {
    public static void main(String[] args) {
        System.out.println(seeColor("blueTimes"));
    }

    public static String seeColor(String str) {
        if(str.length()<3 || str.length()<4 && !str.equals("red")){
            return "";
        }
        String result = str.substring(0,3).equals("red") ? str.substring(0,3) :
                str.substring(0,4).equals("blue") ? str.substring(0,4) : "";
        return result;
    }

}
