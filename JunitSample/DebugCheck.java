public class DebugCheck {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 0, 5 };
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Processing number: " + numbers[i]);
            try {
                int result = 10 / numbers[i];
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error at iteration " + i + ": " + e.getMessage());
            }
        }
    }
}
