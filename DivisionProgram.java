public class DivisionProgram {
    public static void main(String[] args) {
        try {
            // Example usage
            int numerator = 10;
            int denominator = 0; // Change this value to see exception handling

            divideNumbers(numerator, denominator);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void divideNumbers(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        int result = numerator / denominator;
        System.out.println("Result of division: " + result);
    }
}

