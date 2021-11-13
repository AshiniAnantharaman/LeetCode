package Easy;

import java.util.Objects;

public class Solution1961 {
    public boolean isPrefixString(String s, String[] words) {
        String concWord = "";
        for (String word : words) {
            concWord = concWord + word;
            if (Objects.equals(s, concWord)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "iloveleetcode";
        String[] words = {"i", "love", "leet", "code"};
        Solution1961 sol = new Solution1961();
        System.out.println(sol.isPrefixString(s, words));
    }
}
