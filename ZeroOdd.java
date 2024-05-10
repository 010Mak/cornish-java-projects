import java.util.Random;

public class ZeroOdd {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] nums = new int[100];
        int largestOdd = -1;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(12);
            if (nums[i] % 2 != 0 && nums[i] > largestOdd) {
                largestOdd = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = largestOdd;
            }
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
