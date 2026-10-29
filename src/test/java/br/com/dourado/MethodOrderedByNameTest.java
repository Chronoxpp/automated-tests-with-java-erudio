package br.com.dourado;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class MethodOrderedByNameTest
{
  @Test
  void testB()
  {
    System.out.println("testB");
  }

  @Test
  void testA()
  {
    System.out.println("testA");
  }

  @Test
  void testD()
  {
    System.out.println("testD");
  }

  @Test
  void testC()
  {
    System.out.println("testC");
  }
}
