package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTriangleNumberCalculator {

  TriangleNumberCalculator calculator;

  @BeforeEach
  void setUp() {
    calculator = new TriangleNumberCalculator();
  }

  @Test
  void nthTriangleNumber() {
    int triangleNumber = 3;
    assertEquals(6, TriangleNumberCalculator.value(triangleNumber));
  }

  @Test
  void addNthAndMthTriangleNumber() {
    assertEquals(16, TriangleNumberCalculator.add(3,4));
  }

  @Test
  void subtractNthAndMthTriangleNumber() {
    assertEquals(4, TriangleNumberCalculator.subtract(4,3));
  }

  @Test
  void multiplyNthAndMthTriangleNumber() {
    assertEquals(60, TriangleNumberCalculator.multiply(4,3));
  }

  @Test
  void divideNthAndMthTriangleNumber() {
    assertEquals(5, TriangleNumberCalculator.divide(5,2));
  }
}
