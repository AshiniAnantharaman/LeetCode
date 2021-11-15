//75.12%
package Easy;

public class Solution1512 {
    public int numIdenticalPairs(int[] nums) {
        int sum = 0;
        for (int i = 0; i<nums.length; i++){
            for(int j = i; j<nums.length; j++){
                if(nums[i] == nums[j] && i<j){
                    sum++;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,1};
        Solution1512 sol = new Solution1512();
        System.out.println(sol.numIdenticalPairs(nums));
    }
}
