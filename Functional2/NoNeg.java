/*

Given a list of integers, return a list of the integers, omitting any that are less than 0.

noNeg([1, -2]) → [1]
noNeg([-3, -3, 3, 3]) → [3, 3]
noNeg([-1, -1, -1]) → []

 */

package Functional2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NoNeg {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(-2);
        System.out.println(noNeg(list1));
    }

    public static List<Integer> noNeg(List<Integer> nums) {
        nums = nums.stream().filter(e -> e >= 0)
                .collect(Collectors.toList());
        return nums;
    }

}
