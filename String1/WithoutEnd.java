package String1;

/*

Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.

withoutEnd("Hello") → "ell"
withoutEnd("java") → "av"
withoutEnd("coding") → "odin"

 */

public class WithoutEnd {
    public static void main(String[] args) {
        String str = new String("Hello");
        System.out.println(withoutEnd(str));
    }

    public static String withoutEnd(String str) {
        return str.substring(1, str.length()-1);
    }

}
