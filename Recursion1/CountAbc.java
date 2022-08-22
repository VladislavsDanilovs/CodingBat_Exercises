/*


Count recursively the total number of "abc" and "aba" substrings that appear in the given string.


countAbc("abc") → 1
countAbc("abcxxabc") → 2
countAbc("abaxxaba") → 2

 */

package Recursion1;

public class CountAbc {
    public static void main(String[] args) {
        System.out.println(countAbc("abaxxaba"));
    }

    public static int countAbc(String str) {
        if(str.length()<=2){
            return 0;
        }
        String firstThreeLetters = str.substring(0,3);
        if(firstThreeLetters.equals("abc")
                || firstThreeLetters.equals("aba")){
            return 1+countAbc(str.substring(1));
        }
        return countAbc(str.substring(1));
    }

}
