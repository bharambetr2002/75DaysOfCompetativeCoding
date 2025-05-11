package Day4;

import java.util.Arrays;

public class leetcode136 {
    public static int main(String[] args) {
        int[] nums = { 4, 1, 2, 1, 2 };
        Arrays.sort(nums);
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }
}
