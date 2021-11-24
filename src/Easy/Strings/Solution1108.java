package Easy.Strings;

public class Solution1108 {
    public String defangIPaddr(String address) {
        String ans = address.replaceAll(".", "[.]");
        return ans;
    }
}
