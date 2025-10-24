//Leetcode problem 2048
//2048. Next Greater Numerically Balanced Number
//
//An integer x is numerically balanced if for every digit d in the number x,
//there are exactly d occurrences of that digit in x.
//Given an integer n, return the smallest numerically
//balanced number strictly greater than n.
//
//Example 1:
//Input: n = 1
//Output: 22
//Explanation:
//22 is numerically balanced since:
//- The digit 2 occurs 2 times.
//It is also the smallest numerically balanced number strictly greater than 1.
//
//Example 2:
//Input: n = 1000
//Output: 1333
//Explanation:
//1333 is numerically balanced since:
//- The digit 1 occurs 1 time.
//- The digit 3 occurs 3 times.
//It is also the smallest numerically balanced number strictly greater than 1000.
//Note that 1022 cannot be the answer because 0 appeared more than 0 times.
//
//Example 3:
//Input: n = 3000
//Output: 3133
//Explanation:
//3133 is numerically balanced since:
//- The digit 1 occurs 1 time.
//- The digit 3 occurs 3 times.
//It is also the smallest numerically balanced number strictly greater than 3000.

//
 // SOLVED at 24.10.25
//

public class LC_2048 {
    public static void main(String[] args) {
        System.out.println(nextBeautifulNumber(1));
        System.out.println(nextBeautifulNumber(1000));
        System.out.println(nextBeautifulNumber(3000));
    }
    
    public static int nextBeautifulNumber(int n) {
        int result = n + 1;

        while (!isBeautiful(result)){
            result++;
        }

        return result;
    }

    public static boolean isBeautiful(int number){
        String numberAsString = String.valueOf(number);
        for (int i = 0; i < numberAsString.length(); i++) {
            int digit = Character.getNumericValue(numberAsString.charAt(i));
            int sum = 0;

            for (int j = 0; j < numberAsString.length(); j++) {
                if (digit == Character.getNumericValue(numberAsString.charAt(j))) {
                    sum++;
                }
            }
            if (sum != digit)
                return false;
        }
        return true;
    }
}
