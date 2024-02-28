public class IntegerMathOpsEx2 {
    public static void main(String[] args) {
        int a = 200, b = 58, c = 80;
        int d = a - c;
        int e = 13;

        a = d;
        c = a + b;
        c = d - c;
        b = c + a;
        d = a + b % e + 2*c - d;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
        System.out.println("e: " + e);
    }
}