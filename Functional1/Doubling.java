/*

Given a list of integers, return a list where each integer is multiplied by 2.

doubling([1, 2, 3]) → [2, 4, 6]
doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
doubling([]) → []

 */

package Functional1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Doubling {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(doubling(nums));
    }

    public static List<Integer> doubling(List<Integer> nums) {

        nums = nums.stream().map(e -> e * 2)
                .collect(Collectors.toList());
        return nums;
    }

    /*  OR the equivalent java streams solution:
          nums = nums.replaceAll(n -> n * 2);
          return nums;
     */
}
