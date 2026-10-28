package br.com.dourado.math;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Math Operations in SimpleMath Class")
class SimpleMathTest
{
  SimpleMath simpleMath;

  @BeforeEach
  void beforeEach()
  {
    simpleMath = new SimpleMath();
  }

  @DisplayName("Test 6.2 / 2 = 3.1")
  @ParameterizedTest
  @CsvSource({
    "6.2, 2, 3.1",
    "71, 14, 5.07",
    "18.3, 3.1, 5.9"
  })
  void testDivision(double firstNumber, double secondNumber, double excepted)
  {
    Double actual = simpleMath.division(firstNumber, secondNumber);

    assertEquals(
      excepted,
      actual,
      0.01,
      () -> firstNumber + " / " + secondNumber + " did not produce " + excepted
    );
  }
}