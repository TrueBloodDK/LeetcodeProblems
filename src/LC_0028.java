//Leetcode problem 28
//28. Find the Index of the First Occurrence in a String
//
//Given two strings needle and haystack, return the index of
//the first occurrence of needle in haystack, or -1 if needle
//is not part of haystack.
//
//Example 1:
//Input: haystack = "sadbutsad", needle = "sad"
//Output: 0
//Explanation: "sad" occurs at index 0 and 6.
//The first occurrence is at index 0, so we return 0.
//
//Example 2:
//Input: haystack = "leetcode", needle = "leeto"
//Output: -1
//Explanation: "leeto" did not occur in "leetcode", so we return -1.
//
//Constraints:
//    1 <= haystack.length, needle.length <= 104
//    haystack and needle consist of only lowercase English characters.
//

//
// SOLVED at 27.01.25
//

public class LC_0028 {
    public static void main(String[] args) {
        System.out.println(strStr("gownopizdagowno", "gowno"));
        System.out.println(strStr("sadbutsad", "sad"));
        System.out.println(strStr("leetcodel", "leeto"));
        System.out.println(strStr("sad", "true"));
    }

    public static int strStr(String haystack, String needle) {
        int result = -1;

        for (int i = 0; i < haystack.length(); i++) {

            if (haystack.charAt(i) == needle.charAt(0)){
                int count = 0;
                for (int j = 0; j < needle.length(); j++) {
                    if (i+j < haystack.length() && haystack.charAt(i+j) == needle.charAt(j))
                        count++;
                }

                if (count == needle.length())
                    return i;

            }

        }

        return result;
    }

// НАМНОГО БОЛЕЕ ПРОСТО РЕШЕНИЕ
//    public int strStr(String haystack, String needle) {
//        for(int i = 0, j = needle.length(); j<=haystack.length(); i++,j++){
//            if(haystack.substring(i,j).equals(needle)){
//                return i;
//            }
//        }
//        return -1;
//    }
}
