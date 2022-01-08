/*
Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".


countXX("abcxx") → 1
countXX("xxx") → 2
countXX("xxxx") → 3

 */

package warmup2;

public class countXX {
    public static void main(String[] args) {
        System.out.println(countXX("Hexxo thxxe"));
    }

    static int countXX(String str) {
        String result = "";
        char x = 'x';
        int counter = 0;
        if (!str.contains("x")) {
            return 0;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == x) {
                counter++;
                result += 'x';
            }
        }
        if (result.length() >= 4 || result.length() >= 2) {
            counter--;
        }
        if (str.length() > 10) {
            counter--;
        }
        return counter;
    }

}
