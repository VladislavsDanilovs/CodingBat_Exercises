/*


Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
The string length will be at least 2.


right2("Hello") → "loHel"
right2("java") → "vaja"
right2("Hi") → "Hi"


 */

package String1;

import java.util.Map;

public class Right2 {
    public static void main(String[] args) {
        System.out.println(right2("Hello"));

    }

    public static String right2(String str) {
        if (str.length() <= 2) {
            return str;
        }

        return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
    }

}

/*
Sort Map by values:

        Map<String, Integer> nonSortedMap = Map.of(
                "Two", 2,
                "Three", 3,
                "Five", 5,
                "One", 1,
                "Four", 4
        );

        nonSortedMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(e -> System.out.println(e));
        ;

        System.out.println(nonSortedMap);
 */