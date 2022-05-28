/*

Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)


rightDigit([1, 22, 93]) → [1, 2, 3]
rightDigit([16, 8, 886, 8, 1]) → [6, 8, 6, 8, 1]
rightDigit([10, 0]) → [0, 0]

 */

package Functional1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class rightDigit {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(22);
        nums.add(93);

        System.out.println(rightDigit(nums));
    }

    public static List<Integer> rightDigit(List<Integer> nums) {
        nums = nums.stream().map(e -> e % 10)
                .collect(Collectors.toList());
        return nums;
    }

}
