/*


Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".


zipZap("zipXzap") → "zpXzp"
zipZap("zopzop") → "zpzp"
zipZap("zzzopzop") → "zzzpzp"

 */

package String2;

public class zipZap {
    public static void main(String[] args) {
        String str = "zzp";
        System.out.println(zipZap(str));
    }

    public static String zipZap(String str) {
        String result = "";
        int index = 0;
        if (str.length() < 3) {
            return str;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.length() != 3) {
                if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                    index = i + 1;
                }
                if (i > 0 && i == index) {
                    continue;
                }
                result += str.charAt(i);
            } else {
                if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                    result+=""+str.charAt(i)+str.charAt(i+2);
                    break;
                } else{
                    result+=""+str.charAt(i)+str.charAt(i+1)+str.charAt(i+2);
                    break;
                }
            }

        }
        return result;
    }
}
