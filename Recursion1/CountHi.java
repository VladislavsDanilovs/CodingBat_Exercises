/*


Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.


countHi("xxhixx") → 1
countHi("xhixhix") → 2
countHi("hi") → 1

 */


package Recursion1;

public class CountHi {
    public static void main(String[] args) {
        String str = "xxhixx";
        System.out.println(countHi(str));

        System.out.println(str.substring(str.length() - 2, str.length()));
    }

    public static int countHi(String str) {
        if (str.length() < 2) {
            return 0;
        }

        if (str.substring(str.length() - 2, str.length()).equals("hi")) {
            return 1 + countHi(str.substring(0, str.length() - 1));
        }

        return countHi(str.substring(0, str.length() - 1));
    }

}
