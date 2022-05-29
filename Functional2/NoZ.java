/*

Given a list of strings, return a list of the strings, omitting any string that contains a "z". (Note: the str.contains(x) method returns a boolean)

noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"]
noZ(["hziz", "hzello", "hi"]) → ["hi"]
noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]

 */

package Functional2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NoZ {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("aaa");
        list1.add("bbb");
        list1.add("aza");
        System.out.println(noZ(list1));
    }
    public static List<String> noZ(List<String> strings) {
        strings = strings.stream().filter(s -> !s.contains("z"))
                .collect(Collectors.toList());
        return strings;
    }

}
