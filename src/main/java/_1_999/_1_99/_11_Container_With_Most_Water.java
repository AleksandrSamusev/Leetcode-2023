package _1_999._1_99;

public class _11_Container_With_Most_Water {

    public static void show(int[] height) {
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int first = 0;
        int last = height.length - 1;
        int maxArea = 0;

        while (first != last) {
            int hgt = Integer.min(height[first], height[last]);
            int tempSquare = hgt * (last - first);
            if (tempSquare >= maxArea) {
                maxArea = tempSquare;
            }
            if (height[first] <= height[last]) {
                first++;
            } else {
                last--;
            }
        }
        return maxArea;
    }
}
