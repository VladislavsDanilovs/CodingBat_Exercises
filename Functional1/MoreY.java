/*

Given a list of strings, return a list where each string has "y" added at its start and end.


moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"]
moreY(["hello", "there"]) → ["yhelloy", "ytherey"]
moreY(["yay"]) → ["yyayy"]

 */

package Functional1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MoreY {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");

        System.out.println(moreY(strings));
    }

    public static List<String> moreY(List<String> strings) {
        strings = strings.stream().map(e -> "y"+e+"y")
                .collect(Collectors.toList());
        return strings;
    }

}
