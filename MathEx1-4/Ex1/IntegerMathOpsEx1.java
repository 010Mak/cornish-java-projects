public class IntegerMathOpsEx1 {
    public static void main(String[] args) {
        int a = 100, b = 17;
        int sum, diff, prod, quot, rem_ab, rem_ba;

        sum = a + b;
        diff = a - b;
        prod = a * b;
        quot = a / b;
        rem_ab = a % b;
        rem_ba = b % a;

        System.out.println("The sum: a + b = " + sum);
        System.out.println("The difference: a - b = " + diff);
        System.out.println("The product: a * b = " + prod);
        System.out.println("The quotient: a / b = " + quot);
        System.out.println("The remainder of: a / b = " + rem_ab);
        System.out.println("The remainder of: b / a = " + rem_ba);
    }
}
