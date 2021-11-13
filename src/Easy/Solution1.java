package Easy;

import java.util.Arrays;

public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        for (int i=0; i<nums.length;i++){
            for(int j=i+1; j<nums.length;j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        int[] num = {3,2,4};
        int[] ans = sol.twoSum(num,6);
        System.out.println(Arrays.toString(ans));
    }
}
