package _1_999._600_699;

public class _605_Can_Place_Flowers {

    public static void show(int[] flowerbed, int n) {
        System.out.println(canPlaceFlowers(flowerbed, n));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;

        if (flowerbed.length == 0) {
            return false;
        } else if (flowerbed.length == 1) {
            if (flowerbed[0] == 0) {
                count++;
            }
        } else if (flowerbed.length == 2) {
            if (flowerbed[0] == 0 && flowerbed[1] == 0) {
                count++;
            }
        } else {
            for (int i = 0; i <= flowerbed.length - 1; i += 2) {
                if (i == 0) {
                    if (flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                        count++;
                    }
                } else if (i == flowerbed.length - 1) {
                    if (flowerbed[i] == 0 && flowerbed[i - 1] == 0) {
                        count++;
                        break;
                    }
                } else {
                    if (i < flowerbed.length - 2 || i == flowerbed.length - 2 && flowerbed[i - 1] == 0) {
                        if (flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                            count++;
                        }
                    } else if (i == flowerbed.length - 2 && flowerbed[i - 1] == 1) {
                        i--;
                    } else {
                        break;
                    }
                }
            }
        }
        return n <= count;
    }
}
