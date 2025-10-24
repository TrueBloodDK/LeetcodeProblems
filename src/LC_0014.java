//Leetcode problem 14
//14. Longest Common Prefix
//Write a function to find the longest common prefix string amongst an array of strings.
//
//If there is no common prefix, return an empty string "".
//
//Example 1:
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
//
//Example 2:
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.

//
// SOLVED at 20.10.25
//

public class LC_0014 {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"flower", "gowno", "flight", "eebbaaalooo"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();

        int minLength = 200;
        for (int i = 0; i < strs.length; i++) {
            if (minLength > strs[i].length())
                minLength = strs[i].length();
        }

        for (int i = 0; i < minLength; i++) {
            int counter = 0;
            for (int j = 0; j < strs.length - 1; j++) {
                if (strs[j].charAt(i) == strs[j+1].charAt(i)){
                    counter++;
                } else break;
            }
            if (counter == strs.length - 1)
                sb.append(strs[0].charAt(i));
            else break;
        }

        return sb.toString();
    }
}


