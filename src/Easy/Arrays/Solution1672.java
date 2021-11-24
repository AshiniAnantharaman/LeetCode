package Easy.Arrays;

public class Solution1672 {
    int[] sum = new int[100];
    public int maximumWealth(int[][] accounts) {
        for (int i = 0; i<accounts.length; i++){
            for(int j =0; j<accounts[i].length; j++){
                sum[i] = sum[i] + accounts[i][j];
            }
        }
        int max = 0;
        for( int sumVal : sum){
            if(max<sumVal){
                max = sumVal;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] arrays = new int[][]{{2,8,7},{7,1,3},{1,9,5}};
        Solution1672 sol = new Solution1672();
        System.out.println(sol.maximumWealth(arrays));

    }
}
