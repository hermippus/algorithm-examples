package me.hermippus.algorithms;

public class ApplyOperations {

    public static int[] applyOperations(int[] nums) {
        int[] result = new int[nums.length];
        int count = 0;

        int i;
        for (i = 0; i < nums.length - 1; i++) {
            if (nums[i] != 0) {
                if (nums[i] == nums[i + 1]) {
                    result[count] = nums[i] + nums[i + 1];
                    i++;
                } else {
                    result[count] = nums[i];
                }
                count++;
            }
        }
        if (i != nums.length) {
            result[count] = nums[nums.length - 1];
        }
        return result;
    }
}
