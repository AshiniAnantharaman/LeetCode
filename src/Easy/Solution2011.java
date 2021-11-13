package Easy;

public class Solution2011 {
    int ans = 0;
    public int finalValueAfterOperations(String[] operations) {
        for(String op : operations ){
            switch (op.toUpperCase()){
                case "X++":
                    ans++;
                    break;
                case "++X":
                    ++ans;
                    break;
                case "X--":
                    ans--;
                    break;
                case "--X":
                    --ans;
                    break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution2011 sol= new Solution2011();
        String[] oper = {"++x","x++","X--","X++"};
        System.out.println(sol.finalValueAfterOperations(oper));
    }
}
