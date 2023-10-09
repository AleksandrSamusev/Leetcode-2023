package _1_999._300_399;

import java.util.Stack;

public class _394_Decode_String {

    public static void show(String s) {
        System.out.println(decodeString(s));
    }

    public static String decodeString(String s) {

        Stack<Integer> numbers = new Stack<>();
        Stack<String> letters = new Stack<>();
        int index = 0;
        String str = "";

        while(index < s.length()) {
            if(Character.isDigit(s.charAt(index))) {
                int count = 0;
                while(Character.isDigit(s.charAt(index))) {
                    count = count * 10 + (s.charAt(index) - '0');
                    index++;
                }
                numbers.push(count);
            } else if(s.charAt(index) == '[') {
                letters.push(str);
                str = "";
                index++;
            } else if(s.charAt(index) == ']') {
                StringBuilder sb = new StringBuilder(letters.pop());
                int count = numbers.pop();
                for(int i = 0; i<count; i++) {
                    sb.append(str);
                }
                str = sb.toString();
                index++;
            } else {
                str += s.charAt(index);
                index++;
            }
         }
        return str;
    }

}
