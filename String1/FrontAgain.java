/*


Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".


frontAgain("edited") → true
frontAgain("edit") → false
frontAgain("ed") → true

 */

package String1;

public class FrontAgain {
    public static void main(String[] args) {
        System.out.println(frontAgain("edited"));
    }
    public static boolean frontAgain(String str) {
        if(str.length()<=1){
            return false;
        }
        String firstPart = str.substring(0,2);
        String tail = str.substring(str.length()-2, str.length());

        if(firstPart.equals(tail)){
            return true;
        }
        return false;
    }
}
