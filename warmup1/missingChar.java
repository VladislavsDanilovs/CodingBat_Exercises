/*
Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).

missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"
 */

public class missingChar {
    public static void main(String[] args) {
        System.out.println(missingChar("kitten", 1));
    }

    public static String missingChar(String str, int n) {
        if (n < 0) {
            return "Incorrect index";
        } else {
            String front = str.substring(0, n);
            String back = str.substring(n + 1, str.length());
            return front + back;
        }
    }

    /* Alternetive solution:
       StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(n);
        String str2 = sb.toString();
        return str2;
     */
}
