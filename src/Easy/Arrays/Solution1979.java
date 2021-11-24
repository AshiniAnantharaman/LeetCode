package Easy.Arrays;

class Solution1979 {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int gcd = 1;
        for(int num : nums){
            if(min>num){

                min = num;
            }
            if(max<num){
                max = num;
            }
        }
        for (int i=2; i<=max; i++) {
            if (max % i == 0 && min % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        Solution1979 sol = new Solution1979();
        int[] num = {8,5,8,7,4};
        System.out.println(sol.findGCD(num));
    }
}