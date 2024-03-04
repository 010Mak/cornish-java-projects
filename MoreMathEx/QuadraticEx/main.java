public class Main {
    public static void main(String[] args) {
        double a = 1;
        double b = -3;
        double c = -4;
        double discriminant = b * b - 4 * a * c;
        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        System.out.println(root1 + root2);
    }
}