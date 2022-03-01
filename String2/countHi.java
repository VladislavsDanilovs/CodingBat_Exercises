/*

Return the number of times that the string "hi" appears anywhere in the given string.


countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2

 */

package String2;

public class countHi {
    public static void main(String[] args) {
        String countHi = "abc hi ho";
        System.out.println(countHi(countHi));
    }

    public static int countHi(String str) {
        int counter = 0;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == 'h' && str.charAt(i) == 'i') {
                counter++;
            }
        }
        return counter;
    }
}
