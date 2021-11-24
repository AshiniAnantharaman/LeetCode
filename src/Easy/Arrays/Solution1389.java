package Easy.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution1389 {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList arr = new ArrayList();
        for(int i =0; i<nums.length;i++){
            int pos = index[i];
            arr.add(pos,nums[i]);
        }
        int[] ans = new int[arr.size()];
        for (int j =0; j<arr.size();j++){
            ans[j] = (int) arr.get(j);
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution1389 sol = new Solution1389();
        int[] nums = new int[] {1,2,3,4,0};
        int[] index = new int[] {0,1,2,3,0};
        int[] ans = sol.createTargetArray(nums,index);
        System.out.println(Arrays.toString(ans));
    }
}
