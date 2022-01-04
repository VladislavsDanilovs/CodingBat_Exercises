/*

Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.


delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"

 */


public class delDel {
    public static void main(String[] args) {
        System.out.println(delDel("adelbc"));
    }

    public static String delDel(String str) {
        if (str.length() > 3) {
            String del = str.substring(1, 4);
            String str2 = str.substring(4, str.length());
            if (str.length() <= 2) {
                return str;
            }
            if (del.equals("del")) {
                return str.charAt(0) + str2;
            }
        }
        return str;
    }

    /*
    Alternative better solution:

public String delDel(String str) {
  if (str.length()>=4 && str.substring(1, 4).equals("del")) {
    // First char + rest of string starting at 4
    return str.substring(0, 1) + str.substring(4);
  }
  // Otherwise return the original string.
  return str;
}


     */

}
