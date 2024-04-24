public class OddFive {
    public static void main(String[] args) {
        int count = 0; 
        
        for (int i = 1; i <= 200; i += 2) { 
            System.out.print(i + " "); 

            count++; 
            if (count == 5) { 
                System.out.println(); 
                count = 0; 
            }
        }

        if (count != 0) {
            System.out.println();
        }
    }
}
