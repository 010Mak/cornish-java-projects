import java.util.Arrays;

public class ArraySort1 {
    public static void main(String[] args) {
        double[] val = {2.1, 3.2, 8.7, 5.2, 6.6, 7.5};
        Arrays.sort(val);

        for (double v : val) {
            System.out.print(v + " ");
        }
    }
}
