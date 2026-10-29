package br.com.dourado;

import org.junit.jupiter.api.*;

//@Order(3)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MethodOrderedByIndexTest
{
  StringBuilder actualValue = new StringBuilder("");

  @AfterEach
  void afterEach()
  {
    System.out.println("Actual is: " + actualValue);
  }

  @Test
  @Order(1)
  void testB()
  {
    System.out.println("testB");
    actualValue.append("1");
  }

  @Order(2)
  @Test
  void testA()
  {
    System.out.println("testA");
    actualValue.append("2");
  }

  @Order(3)
  @Test
  void testD()
  {
    System.out.println("testD");
    actualValue.append("3");
  }

  @Order(4)
  @Test
  void testC()
  {
    System.out.println("testC");
    actualValue.append("4");
  }
}
