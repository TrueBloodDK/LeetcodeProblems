//Leetcode problem 3370
//3370. Smallest Number With All Set Bits
//
//You are given a positive number n.
//
//Return the smallest number x greater than or equal to n,
//such that the binary representation of x contains only set bits
//
//
//Example 1:
//Input: n = 5
//Output: 7
//Explanation:
//The binary representation of 7 is "111".
//
//Example 2:
//Input: n = 10
//Output: 15
//Explanation:
//The binary representation of 15 is "1111".
//
//Example 3:
//Input: n = 3
//Output: 3
//Explanation:
//The binary representation of 3 is "11".
//
//Constraints:
//    1 <= n <= 1000

//
 // SOLVED at 29.10.25
//

public class LC_3370 {
    public static void main(String[] args) {
        smallestNumber(32);
    }

    public static int smallestNumber(int n) {
        int result = 0;

        for (int i = 0; n > result; i++) {
            result = (int) Math.pow(2, i) - 1;
        }

        return result;
    }
}
