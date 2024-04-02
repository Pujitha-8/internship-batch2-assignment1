public class CustomValidationException extends Exception {
    public CustomValidationException(String message) {
        super(message);
    }

    public static void validateNumber(int number) throws CustomValidationException {
        if (number < 0) {
            throw new CustomValidationException("Number cannot be negative");
        }
    }

    public static void main(String[] args) {
        try {
            int inputNumber = -5; // Replace this with your desired input number
            validateNumber(inputNumber);
            System.out.println("Number is valid: " + inputNumber);
        } catch (CustomValidationException e) {
            System.out.println("CustomValidationException: " + e.getMessage());
        }
    }
}
