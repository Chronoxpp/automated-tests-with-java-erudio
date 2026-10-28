package br.com.dourado.math;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

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

  @ParameterizedTest
  @ValueSource(strings = {"Lucas", "Eduarda", "Geovana", "Benjamin"})
  void testValueSource(String firstName)
  {
    System.out.println(firstName);
    assertNotNull(firstName);
  }

  @DisplayName("Test double subtraction [firstNumber, secondNumber, expected]")
  @ParameterizedTest
  @CsvFileSource(resources = "/testDivision.csv")
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