/*
Given a string, return a new string where the first and last chars have been exchanged.

frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
 */


public class frontBack {
    public static void main(String[] args) {
        System.out.println(frontBack("code"));
    }

    public static String frontBack(String str) {
        if (str.length() <= 1) {
            return str;
        } else {
            String mid = str.substring(1, str.length() - 1);
            return str.charAt(str.length() - 1) + mid + str.charAt(0);
        }
    }

}

/*
my first wrong solution:

    public static String frontBack(String str) {
       char starts = str.charAt(0);
       char ends = str.charAt(str.length()-1);

       String a1 = str.replace(starts, ends);
        a1 = str.replace(str.charAt(str.length()-1), starts);
       return a1;
    }
 */