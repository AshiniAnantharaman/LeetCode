//67.95%
package Easy.Arrays;

import java.util.Arrays;

public class Solution1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int small = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    small++;
                }
            }
            ans[i] = small;
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution1365 sol = new Solution1365();
        int[] nums = {6,5,4,8};
        System.out.println(Arrays.toString(sol.smallerNumbersThanCurrent(nums)));
    }
}
