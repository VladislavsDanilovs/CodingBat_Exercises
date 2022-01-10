/*
Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).

last2("hixxhi") → 1
last2("xaxxaxaxx") → 1
last2("axxxaaxx") → 2
 */

package warmup2;

public class last2 {
    public static void main(String[] args) {
        System.out.println(last2("hixxhi"));
    }

    public static int last2(String str) {
        int counter = 0;
        if (str.length() < 2) {
            counter = 0;
        }
        if (str.length() > 2) {
            String last2 = "" + str.charAt(str.length()
                    - 2) + str.charAt(str.length() - 1);
            for (int i = 0; i < str.length() - 2; i++) {
                if (str.substring(i, i + 2).equals(last2)) {
                    counter++;
                }
            }
        }
        return counter;
    }

}
