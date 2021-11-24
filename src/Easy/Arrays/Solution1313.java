package Easy.Arrays;

public class Solution1313 {
    public int[] decompressRLElist(int[] nums) {
        int freqTotal = 0;
        for (int i=0; i<nums.length; i=i+2){
            freqTotal+= nums[i];
        }

        int[] ans = new int[freqTotal];
        int index = 0;
        for (int i = 0; i<nums.length; i=i+2){
            int freq = nums[i];
            int val = nums[i+1];
            while(freq!=0){
                ans[index] = val;
                index++;
                freq--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution1313 sol = new Solution1313();
        int[] nums = new int[] {1,1,2,3};
        System.out.println(sol.decompressRLElist(nums));
    }
}
