/*Write a function that takes an array of numbers (integers for the tests) and a target number. It should find two different items in the array that,
when added together, give the target value. The indices of these items should then be returned in a tuple like so: (index1, index2).

        For the purposes of this kata, some tests may have multiple answers; any valid solutions will be accepted.

        The input will always be valid (numbers will be an array of length 2 or greater, and all of the items will be numbers;
        target will always be the sum of two different items from that array).

        Based on: http://oj.leetcode.com/problems/two-sum/
        */


import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> checkedNumbers = new HashMap<>();

        int delta;
        for (int i = 0; i < numbers.length; i++) {
            delta = target - numbers[i];
            if (checkedNumbers.containsKey(delta)) {
                return new int[] {checkedNumbers.get(delta), i};
            }

            checkedNumbers.put(numbers[i], i);
        }
        return null;
    }
}
