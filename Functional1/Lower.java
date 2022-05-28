/*

Given a list of strings, return a list where each string is converted to lower case (Note: String toLowerCase() method).


lower(["Hello", "Hi"]) → ["hello", "hi"]
lower(["AAA", "BBB", "ccc"]) → ["aaa", "bbb", "ccc"]
lower(["KitteN", "ChocolaTE"]) → ["kitten", "chocolate"]

 */

package Functional1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lower {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("hi");


        System.out.println(lower(strings));
    }

    public static List<String> lower(List<String> strings) {
        strings = strings.stream().map(e -> e.toLowerCase())
                .collect(Collectors.toList());
        return strings;
    }

}
