/*

Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.

copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]
copies3(["24", "a", ""]) → ["242424", "aaa", ""]
copies3(["hello", "there"]) → ["hellohellohello", "theretherethere"]

 */

package Functional1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class copies3 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("bb");
        strings.add("ccc");

        System.out.println(copies3(strings));
    }

    public static List<String> copies3(List<String> strings) {
        strings = strings.stream().map(e -> e+e+e)
                .collect(Collectors.toList());
        return strings;
    }

}
