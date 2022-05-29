/*

Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9. (Note: % by 10)

no9([1, 2, 19]) → [1, 2]
no9([9, 19, 29, 3]) → [3]
no9([1, 2, 3]) → [1, 2, 3]

 */

package Functional2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class No9 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(19);
        System.out.println(no9(list1));
    }
    public static List<Integer> no9(List<Integer> nums) {
        nums = nums.stream().filter(e -> e % 10 != 9)
                .collect(Collectors.toList());
        return nums;
    }

}
