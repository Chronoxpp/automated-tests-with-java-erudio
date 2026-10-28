package br.com.dourado.math;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DemoRepeatedTest
{
  SimpleMath math;
  @BeforeEach
  void beforeEach()
  {
    math = new SimpleMath();
  }

  @RepeatedTest(
    value = 3,
    name = "{displayName}. Repetition " + "{currentRepetition} of {totalRepetitions}!"
  )
  @DisplayName("Test Division by Zero")
  void testDivisionByZero(
    RepetitionInfo repetitionInfo,
    TestInfo testInfo
  )
  {
    double firstNumber = 6.2D;
    double secondNumber = 0;

    var expectedMessage = "Division by zero";

    ArithmeticException actual = assertThrows(
      ArithmeticException.class,
      () -> math.division(firstNumber, secondNumber)
    );

    assertEquals(
      expectedMessage,
      actual.getMessage(),
      () -> "Unexpected exception message!"
    );
  }
}
