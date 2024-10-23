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
    TriangleNumberCalculator.value(triangleNumber);
    assertEquals(6, TriangleNumberCalculator.value(triangleNumber));
  }

  @Test
  void addNthAndMthTriangleNumber() {
    TriangleNumberCalculator.add(3,4);
    assertEquals(16, TriangleNumberCalculator.add(3,4));
  }

  @Test
  void subtractNthAndMthTriangleNumber() {
    TriangleNumberCalculator.subtract(3,4);
    assertEquals(3, TriangleNumberCalculator.add(3,2));
  }
}
