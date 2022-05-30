/*

Given a list of strings, return a list where each string has "y" added at its end, omitting any resulting strings
that contain "yy" as a substring anywhere.

noYY(["a", "b", "c"]) → ["ay", "by", "cy"]
noYY(["a", "b", "cy"]) → ["ay", "by"]
noYY(["xx", "ya", "zz"]) → ["xxy", "yay", "zzy"]

 */

package Functional2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoYY {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(Arrays.asList("a", "b", "c"));
        System.out.println(noYY(list1));
    }
    public static List<String> noYY(List<String> strings) {
        strings = strings.stream().filter(e ->
                        !e.endsWith("y") && !e.contains("yy"))
                .map(e -> e+"y")
                .collect(Collectors.toList());
        return strings;
    }


}
