//Leetcode problem 20
//20. Valid Parentheses
//
//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
//determine if the input string is valid.
//
//An input string is valid if:
//
//    Open brackets must be closed by the same type of brackets.
//    Open brackets must be closed in the correct order.
//    Every close bracket has a corresponding open bracket of the same type.
//
//Example 1:
//Input: s = "()"
//Output: true
//
//Example 2:
//Input: s = "()[]{}"
//Output: true
//
//Example 3:
//Input: s = "(]"
//Output: false
//
//Example 4:
//Input: s = "([])"
//Output: true
//
//Example 5:
//Input: s = "([)]"
//Output: false

//
 // SOLVED at 21.10.25
//

import java.util.Map;
import java.util.Stack;

public class LC_0020 {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("{]"));
        System.out.println(isValid("([])"));
        System.out.println(isValid("([)]"));
    }

     public static boolean isValid(String s) {
         final Map<Character, Character> braces = Map.of(
                ')', '(',
                ']', '[',
                '}', '{'
        );
         Stack<Object> stack = new Stack<>();

         for (int i = 0; i < s.length(); i++) {
             char c = s.charAt(i);
             if (braces.containsValue(c))
                 stack.push(c);
             else if (braces.containsKey(c)) {
                 if (stack.isEmpty() || !stack.pop().equals(braces.get(c)))
                     return false;
             }
         }
         return stack.isEmpty();
    }

// ТАК ЖЕ БОЛЕЕ НОРМАЛЬНОЕ И ЭФФЕКТИВНОЕ РЕШЕНИЕ К КОТОРОМУ БЫЛО БЫ ЛУШЕ ПРИЙТИ В ТЕОРИИ
//    public boolean isValid(String s) {
//        Stack<Character> stack = new Stack<>();
//        for (char ch : s.toCharArray()) {
//            if (ch == '(' || ch == '[' || ch == '{') {
//                stack.push(ch);
//            } else {
//                if (stack.isEmpty()) {
//                    return false;
//                }
//                char top = stack.pop();
//                if (ch == ')' && top != '(') {
//                    return false;
//                }
//                if (ch == ']' && top != '[') {
//                    return false;
//                }
//                if (ch == '}' && top != '{') {
//                    return false;
//                }
//            }
//        }
//        return stack.isEmpty();
//    }
}
