package _1_999._200_299;

public class _283_Move_Zeroes {

    public static void show(int[] nums) {
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        int insertPosition;
        int currentPosition;

        for (currentPosition = 0; currentPosition < nums.length; currentPosition++) {
            insertPosition = findZeroPosition(currentPosition, nums);
            if (insertPosition == -1) {
                break;
            }
            if (currentPosition > nums.length - 2) {
                break;
            }
            boolean flag = findAndinsertToZeroPosition(insertPosition, nums);
            if (flag) {
                break;
            }
        }
    }

    private static int findZeroPosition(int currentPosition, int[] nums) {
        for (int i = currentPosition; i < nums.length; i++) {
            if (nums[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    private static boolean findAndinsertToZeroPosition(int insertPosition, int[] nums) {
        for (int i = insertPosition + 1; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[insertPosition] = nums[i];
                nums[i] = 0;
                return false;
            }
        }
        return true;
    }
}
