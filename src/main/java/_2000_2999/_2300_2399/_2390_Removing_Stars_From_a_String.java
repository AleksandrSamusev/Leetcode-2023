package _2000_2999._2300_2399;

import java.util.Stack;

public class _2390_Removing_Stars_From_a_String {

    public static void show(String s) {
        System.out.println(removeStars(s));
    }

    public static String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Character ch : stack) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
