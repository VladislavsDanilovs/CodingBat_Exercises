/*


Loop over the given array of strings to build a result string like this:
when a string appears the 2nd, 4th, 6th, etc. time in the array, append the string to the result.
Return the empty string if no string appears a 2nd time.


wordAppend(["a", "b", "a"]) → "a"
wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
wordAppend(["a", "", "a"]) → "a"

 */

package Map2;

import java.util.HashMap;
import java.util.Map;

public class WordAppend {
    public static void main(String[] args) {
        String[] strArr = new String[] {"a", "b", "a"};
        System.out.println(wordAppend(strArr));
    }

    public static String wordAppend(String[] strings) {
        Map<String,Integer> map = new HashMap<>();
        String result = "";
        for(String s : strings){
            map.putIfAbsent(s, 0);
            map.put(s, map.get(s)+1);
            int times = map.get(s);

            if (times % 2 == 0){
                result += s;
            }
        }
    }

}
