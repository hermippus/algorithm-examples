package me.hermippus.algorithms;

public class TwoSum {

    // O(n^2)
    public static int[] bruteForceTwoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}
