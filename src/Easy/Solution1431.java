package Easy;

import java.util.ArrayList;
import java.util.List;

public class Solution1431 {
    int max = 0;
    int[] extra;
    List<Boolean> ans = new ArrayList<>();
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        for(int i= 0; i<candies.length; i++){
            if (max< candies[i]){
                max = candies[i];
            }
        }
        for(int i=0; i<candies.length; i++){
            if(candies[i] + extraCandies>=max){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;
        Solution1431 sol = new Solution1431();
        System.out.println(sol.kidsWithCandies(candies,extraCandies));
    }
}
