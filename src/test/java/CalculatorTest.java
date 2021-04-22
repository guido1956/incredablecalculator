import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @DisplayName("Adding 2 positive numbers")
    @Test
    void testAddingWith2PositiveNumbers() {
        Calculator calculator = new Calculator();
        int number1 = 40, number2 = 60;
        int expectedResult = 100;
        int actualResult = calculator.adding(number1, number2);
        assertEquals(expectedResult, actualResult, "Adding 2 positive numbers went wrong");
    }

    @DisplayName("Subtracting 2 positive numbers")
    @Test
    void testSubtractingWith2PositiveNumbersEndingInPositiveNumber() {
        Calculator calculator = new Calculator();
        int number1 = 60, number2 = 40;
        int expectedResult = 20;
        int actualResult = calculator.subtrackting(number1, number2);
        assertEquals(expectedResult, actualResult, "Adding 2 positive numbers went wrong");
    }
}






