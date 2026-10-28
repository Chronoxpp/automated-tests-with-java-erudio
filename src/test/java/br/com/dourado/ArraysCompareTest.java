package br.com.dourado;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class ArraysCompareTest
{
  @Test
  void test()
  {
    int[] numbers = {25, 8, 21, 32, 3};
    int[] expectedNumbers = {3, 8, 21, 25, 32};

    Arrays.sort(numbers);

    assertArrayEquals(numbers, expectedNumbers);
  }

  @Test
  @Timeout(value = 15, unit = TimeUnit.MILLISECONDS)
  void testSortPerformance()
  {
    int[] numbers = {25, 8, 21, 32, 3};

    for(int i = 0; i < 100000; i += 1)
    {
      numbers[0] = i;
      Arrays.sort(numbers);
    }
  }
}
