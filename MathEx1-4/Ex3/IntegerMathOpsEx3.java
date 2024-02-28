public class IntegerMathOpsEx3 {
    public static void main(String[] args) {
        int a = 100;
        a = a + 1;
        System.out.println("a = " + a);
        a = a - 1;
        System.out.println("a = " + a);

        int b = 20, c = 0;
        a = 100;
        b = b + 1;
        c = a + b;
        System.out.println("b = " + b + ", c = " + c);

        b = 20;
        a = 100;
        b = b - 1;
        c = a + b;
        System.out.println("b = " + b + ", c = " + c);
    }
}