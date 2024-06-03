// Import the BigDecimal class for precise arithmetic operations
import java.math.BigDecimal;

public class ArcCosineCalculator {
    
    // Method to calculate the arc cosine of a BigDecimal value
    public static BigDecimal arcCosine(BigDecimal x) {

        // Check if the input value is within the valid range [-1, 1]
        if (x.compareTo(BigDecimal.valueOf(-1)) < 0 || x.compareTo(BigDecimal.valueOf(1)) > 0) {
            // Throw an exception if the input is out of range
            throw new IllegalArgumentException("Input x must be in the range [-1, 1]");
        }
        // Calculate the arc cosine using Math.acos and return the result as a BigDecimal
        return BigDecimal.valueOf(Math.acos(x.doubleValue()));
    }

    public static void main(String[] args) {
        // Create a BigDecimal object with the value 0.5
        BigDecimal x = BigDecimal.valueOf(0.5);
        // Call the arcCosine method and store the result
        BigDecimal result = arcCosine(x);
        // Print the result to the console
        System.out.println("arcCos(" + x + ") = " + result);
    }
}