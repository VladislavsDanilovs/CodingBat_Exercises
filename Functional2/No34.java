/*

Given a list of strings, return a list of the strings, omitting any string length 3 or 4.


no34(["a", "bb", "ccc"]) → ["a", "bb"]
no34(["a", "bb", "ccc", "dddd"]) → ["a", "bb"]
no34(["ccc", "dddd", "apple"]) → ["apple"]

 */

package Functional2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class No34 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(Arrays.asList("a", "bb", "ccc"));
        System.out.println(no34(list1));
    }

    public static List<String> no34(List<String> strings) {
        strings = strings.stream().filter(
                        e -> e.length() != 3 &&
                                e.length() != 4
                )
                .collect(Collectors.toList());
        return strings;
    }

}
