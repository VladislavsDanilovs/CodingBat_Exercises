/*

Given a list of strings, return a list of the strings, omitting any string length 4 or more.


noLong(["this", "not", "too", "long"]) → ["not", "too"]
noLong(["a", "bbb", "cccc"]) → ["a", "bbb"]
noLong(["cccc", "cccc", "cccc"]) → []

 */

package Functional2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NoLong {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("this");
        list1.add("not");
        list1.add("too");
        list1.add("long");
        System.out.println(noLong(list1));
    }

    public static List<String> noLong(List<String> strings) {
        strings = strings.stream().filter(e -> e.length() < 4)
                .collect(Collectors.toList());
        return strings;
    }

}
