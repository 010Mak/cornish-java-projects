public class EqualSplit {
    public static void main(String[] args) {
        int[] vals = {12, 7, 3, 11, 8, 5, 9, 10, 6, 3, 8, 2, 1, 7, 8, 1, 11, 4, 5, 12, 6, 2, 9, 0, 10, 4, 7, 11, 5, 3, 8, 0, 6};
        int totalSum = 0;

 
        for (int val : vals) {
            totalSum += val;
        }

 
        if (totalSum % 2 != 0) {
            System.out.println("Cannot split array into equal sum halves.");
            return;
        }

        int halfSum = totalSum / 2;
        int sum = 0;
        boolean canSplit = false;

        for (int val : vals) {
            sum += val;
            if (sum == halfSum) {
                canSplit = true;
                break;
            }
        }

        if (canSplit) {
            System.out.println("good");
        } else {
            System.out.println("cannot split");
        }
    }
}
