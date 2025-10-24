//Leetcode problem 2011
//2011. Final Value of Variable After Performing Operations
//
//here is a programming language with only four operations and one variable X:
//
//        ++X and X++ increments the value of the variable X by 1.
//        --X and X-- decrements the value of the variable X by 1.
//
//Initially, the value of X is 0.
//
//Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.

//
// SOlVED at 20.10.25
//

import java.util.Objects;

public class LC_2011 {
    public static void main(String[] args) {
        System.out.println(finalValueAfterOperations(new String[]{"++X", "X++", "X--"}));
    }

    public static int finalValueAfterOperations(String[] operations){
        int result = 0;

        for (String string: operations)
            if (Objects.equals(string, "++X") || Objects.equals(string, "X++")) {
                result++;
            } else result--;
        return result;
    }
}