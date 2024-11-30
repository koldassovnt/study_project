package leetcode.easy;


/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 * <p>
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * <p>
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        if (strs.length == 1) {
            return strs[0];
        }

        String prefix = strs[0];

        int idx = 1;

        while (idx < strs.length) {

            if ("".equals(prefix)) {
                return "";
            }

            if (!strs[idx].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                continue;
            }

            idx++;

        }

        return prefix;

    }

    public static void main(String[] args) {

        String[] strs0 = new String[]{"flower", "flow", "flight"};

        String[] strs1 = new String[]{"dog", "racecar", "car"};

        LongestCommonPrefix lcp = new LongestCommonPrefix();

        System.out.println(lcp.longestCommonPrefix(strs0));
        System.out.println(lcp.longestCommonPrefix(strs1));

    }

}
