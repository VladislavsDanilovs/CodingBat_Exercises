/*

Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.


repeatSeparator("Word", "X", 3) → "WordXWordXWord"
repeatSeparator("This", "And", 2) → "ThisAndThis"
repeatSeparator("This", "And", 1) → "This"

 */

package String2;

public class repeatSeparator {
    public static void main(String[] args) {
        String str1 = "Word";
        int number = 3;
        String str2 = "X";
        System.out.println(repeatSeparator(str1, str2, 3));
    }

    public static String repeatSeparator(String word, String sep, int count) {
        String temp = "";

        for (int i = 0; i < count; i++) {
            if (count - 1 == i) {
                temp = temp + word;
                break;
            }
            temp = temp + word + sep;
        }
        return temp;
    }

}
