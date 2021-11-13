package Easy;

import java.util.Arrays;

public class Solution1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        for(int i=0; i<n; i=i+1){
                ans[2*i] = nums[i];
                ans[(2*i)+1] = nums[i+n];
            }
        return ans;
    }

    public static void main(String[] args) {
        Solution1470 sol = new Solution1470();
        int[] nums = {2,5,1,3,4,7};
        int[] ans = sol.shuffle(nums,3);
        System.out.println(Arrays.toString(ans));
    }
}
