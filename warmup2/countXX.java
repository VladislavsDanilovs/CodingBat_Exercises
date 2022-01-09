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
        int counter = 0;
        if (str.length() > 1) {
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i - 1) == 'x' && str.charAt(i) == 'x') {
                    counter++;
                }
            }
        }
        return counter;
    }

}
