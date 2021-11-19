package Easy;

import java.util.Arrays;

public class Solution1528 {
    public String restoreString(String s, int[] indices) {
        char[] arr = s.toCharArray();
        char[] ans = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            int temp = indices[i];
            ans[temp] = arr[i];
        }
        return new String(ans);
    }

    public static void main(String[] args) {
        Solution1528 sol = new Solution1528();
        int[] arr = new int[]{4,5,6,7,0,2,1,3};
        System.out.println(sol.restoreString("codeleet",arr));
    }
}
