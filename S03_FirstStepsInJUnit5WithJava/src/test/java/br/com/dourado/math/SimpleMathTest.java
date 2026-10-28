package br.com.dourado.math;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
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
  @MethodSource("testDivisionInputParameters")
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

  public static Stream<Arguments> testDivisionInputParameters()
  {
    return Stream.of(
      Arguments.of(6.2D, 2D, 3.1D),
      Arguments.of(71D, 14D, 5.07D),
      Arguments.of(18.3D, 3.1D, 5.9D)
    );
  }
}