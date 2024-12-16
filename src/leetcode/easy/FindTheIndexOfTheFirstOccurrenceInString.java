package leetcode.easy;

/**
 * Given two strings needle and haystack,
 * return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * <p>
 * Input: haystack = "sadbutsad", needle = "sad"
 * Output: 0
 * Explanation: "sad" occurs at index 0 and 6.
 * The first occurrence is at index 0, so we return 0.
 * <p>
 * Input: haystack = "leetcode", needle = "leeto"
 * Output: -1
 * Explanation: "leeto" did not occur in "leetcode", so we return -1.
 */
public class FindTheIndexOfTheFirstOccurrenceInString {

    public int strStr(String haystack, String needle) {

        int needleSize = needle.length();
        int i = 0;

        while (i < haystack.length()) {

            if (i + needleSize > haystack.length()) {
                return -1;
            }

            String substring = haystack.substring(i, i + needleSize);

            if (substring.equals(needle)) {
                return i;
            }

            i++;

        }

        return -1;

    }

    public static void main(String[] args) {

        FindTheIndexOfTheFirstOccurrenceInString find = new FindTheIndexOfTheFirstOccurrenceInString();

        String haystack0 = "sadbutsad";
        String needle0 = "sad";

        String haystack1 = "leetcode";
        String needle1 = "leeto";

        System.out.println(find.strStr(haystack0, needle0));
        System.out.println(find.strStr(haystack1, needle1));

    }

}
