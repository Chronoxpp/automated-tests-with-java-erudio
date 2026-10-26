package br.com.dourado.math;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Math Operations in SimpleMath Class")
class SimpleMathTest
{
    @Test
    @DisplayName("Test 6.2 + 2 = 8.2")
    void testSum_When_SixDotTwoAddedByTwo_ShouldReturnEightDotTwo()
    {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        double excepted = 8.2D;

        Double actual = math.sum(firstNumber, secondNumber);

        assertEquals(
            excepted,
            actual,
            () -> firstNumber + " + " + secondNumber + " did not produce " + excepted
        );
    }

    @Test
    @DisplayName("Test 6.2 - 2 = 4.2")
    void testSubtraction()
    {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;

        Double actual = math.subtraction(firstNumber, secondNumber);
        double excepted = 4.2D;

        assertEquals(
            excepted,
            actual,
            () -> firstNumber + " - " + secondNumber + " did not produce " + excepted
        );

        assertNotEquals(9.2D, actual);
        assertNotNull(actual);
    }

    @Test
    @DisplayName("Test 6.2 * 2 = 12.4")
    void testMultiplication()
    {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;

        Double actual = math.multiplication(firstNumber, secondNumber);
        double excepted = 12.4D;

        assertEquals(
            excepted,
            actual,
            () -> firstNumber + " * " + secondNumber + " did not produce " + excepted
        );

        assertNotEquals(9.2D, actual);
        assertNotNull(actual);
    }

    @Test
    @DisplayName("Test 6.2 / 2 = 3.1")
    void testDivision()
    {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;

        Double actual = math.division(firstNumber, secondNumber);
        double excepted = 3.1D;

        assertEquals(
            excepted,
            actual,
            () -> firstNumber + " / " + secondNumber + " did not produce " + excepted
        );

        assertNotEquals(9.2D, actual);
        assertNotNull(actual);
    }

    @Test
    @DisplayName("Test division by zero")
    void testDivision_When_firstNumberIsDivededByZero_ShouldThrowArithmeticException()
    {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 0D;

        ArithmeticException arithmeticException = assertThrows(
            ArithmeticException.class,
            () -> math.division(firstNumber, secondNumber)
        );

        String actualMessage = arithmeticException.getMessage();
        String expectedMessage = "Division by zero";

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    @DisplayName("Test (6.2 + 2) / 2 = 4.1")
    void testMean()
    {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;

        Double actual = math.mean(firstNumber, secondNumber);
        double excepted = 4.1D;

        assertEquals(
            excepted,
            actual,
            () -> "(" + firstNumber + " + " + secondNumber + ") / 2 did not produce " + excepted
        );

        assertNotEquals(9.2D, actual);
        assertNotNull(actual);
    }

    @Test
    @DisplayName("Test Square root of 16 = 4")
    void testSquareRoot()
    {
        SimpleMath math = new SimpleMath();
        double number = 16D;

        Double actual = math.squareRoot(number);
        double excepted = 4D;

        assertEquals(
            excepted,
            actual,
            () -> "Square Root of " + number + " did not produce " + excepted
        );

        assertNotEquals(9.2D, actual);
        assertNotNull(actual);
    }
}