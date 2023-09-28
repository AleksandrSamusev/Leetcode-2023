package _1_999._400_499;

import java.util.Arrays;

public class _443_String_Compression {

    public static void show(char[] chars) {
        System.out.println(compress(chars));
    }

    public static int compress(char[] chars) {
        int count = 0;
        int insertPosition = 0;
        int currentPosition;
        char currentChar = chars[0];

        for (currentPosition = 0; currentPosition < chars.length; currentPosition++) {
            if (chars[currentPosition] == currentChar) {
                count++;
            } else {
                if (count == 1) {
                    chars[insertPosition] = currentChar;
                    insertPosition++;
                } else if (count < 10) {
                    chars[insertPosition] = currentChar;
                    chars[insertPosition + 1] = (char) (count + '0');
                    insertPosition += 2;
                } else {
                    chars[insertPosition] = currentChar;
                    insertPosition++;
                    addLongGroupNumbersToArray(count, chars, insertPosition);
                    insertPosition += Integer.toString(count).length();
                }
                count = 1;
                currentChar = chars[currentPosition];
            }
            if (currentPosition == chars.length - 1) {
                if (count == 1) {
                    chars[insertPosition] = currentChar;
                    insertPosition++;
                } else if (count < 10) {
                    chars[insertPosition] = currentChar;
                    chars[insertPosition + 1] = (char) (count + '0');
                    insertPosition += 2;
                } else {
                    chars[insertPosition] = currentChar;
                    insertPosition++;
                    addLongGroupNumbersToArray(count, chars, insertPosition);
                    insertPosition += Integer.toString(count).length();
                }
            }
        }
        System.out.println(Arrays.toString(chars));
        System.out.println("Current position = " + currentPosition);
        System.out.println("Insert position = " + insertPosition);
        return insertPosition;
    }

    private static void addLongGroupNumbersToArray(int n, char[] chars, int pos) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int rest = n % 10;
            n = n / 10;
            sb.append(rest);
        }
        String temp = sb.reverse().toString();
        for (int i = 0; i < temp.length(); i++) {
            chars[i + pos] = temp.charAt(i);
        }
    }
}
