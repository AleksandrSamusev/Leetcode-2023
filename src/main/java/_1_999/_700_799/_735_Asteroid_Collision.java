package _1_999._700_799;

import java.util.Arrays;
import java.util.Stack;

public class _735_Asteroid_Collision {

    public static void show(int[] arr) {
        System.out.println(Arrays.toString(asteroidCollision(arr)));
    }

    public static int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            if (stack.isEmpty() || asteroids[i] > 0) {
                stack.push(asteroids[i]);
            } else {
                while (true) {
                    int peek = stack.peek();
                    if (peek == -asteroids[i]) {
                        stack.pop();
                        break;
                    } else if (peek < 0) {
                        stack.push(asteroids[i]);
                        break;
                    } else if (peek < -asteroids[i]) {
                        stack.pop();
                        if (stack.isEmpty()) {
                            stack.push(asteroids[i]);
                            break;
                        }
                    } else if (peek > -asteroids[i]) {
                        break;
                    }
                }
            }
        }
        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }
}
