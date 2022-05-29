/*

Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.


noTeen([12, 13, 19, 20]) → [12, 20]
noTeen([1, 14, 1]) → [1, 1]
noTeen([15]) → []

 */

package Functional2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NoTeen {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(13);
        list1.add(19);
        list1.add(20);
        System.out.println(noTeen(list1));
    }

    public static List<Integer> noTeen(List<Integer> nums) {
        nums = nums.stream().filter(e -> e < 13 || e > 19)
                .collect(Collectors.toList());
        return nums;
    }

}
