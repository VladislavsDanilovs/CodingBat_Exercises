/*

Given a list of strings, return a list where each string has all its "x" removed.

noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
noX(["x"]) → [""]

 */

package Functional1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NoX {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("ax");
        strings.add("bb");
        strings.add("cx");

        System.out.println(noX(strings));
    }

    public static List<String> noX(List<String> strings) {
        strings = strings.stream().map(e -> e.replace("x", ""))
                .collect(Collectors.toList());
        return strings;
    }

}
