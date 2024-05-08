import java.util.Collections;
import java.util.Arrays;

public class ArrayReverse1 {
    public static void main(String[] args) {
        Integer[] reverse = {51, 12, 64, 89, 0, 7, 5, 22, 43};
        
        Collections.reverse(Arrays.asList(reverse));
        
        for (int v : reverse) {
            System.out.print(v + " ");
        }
    }
}
