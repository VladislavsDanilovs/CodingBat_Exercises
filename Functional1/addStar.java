/*

Given a list of strings, return a list where each string has "*" added at its end.


addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
addStar(["hello", "there"]) → ["hello*", "there*"]
addStar(["*"]) → ["**"]

 */

package Functional1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class addStar {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("bb");
        strings.add("ccc");

        System.out.println(addStar(strings));
    }

    public static List<String> addStar(List<String> strings) {
        strings = strings.stream().map(e -> e + "*")
                .collect(Collectors.toList());
        return strings;
    }

}
