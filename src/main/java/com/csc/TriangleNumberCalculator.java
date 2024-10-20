package com.csc;

public class TriangleNumberCalculator {
  public static void main(String[] args) {
    int triangleNumber = 3;

    System.out.println(value(triangleNumber));  // This should print out 

    System.out.println(add(1,1));  // This should print out 2
    System.out.println(add(2, 3)); // This should print out 9
    System.out.println(add(4, 2)); // This should print out 13

    System.out.println(subtract(1, 1)); // This should print out 0
    System.out.println(subtract(2, 3)); // This should print out -3
    System.out.println(subtract(4, 2)); // This should print out 7
  }

  static int value(int n) {
    if (n <= 1) {    // Base case
      return 1;
    }

    return(value(n - 1) + n);    // recursive call; add each integer up to and including the nth
  }

  static int add(int n, int m) {
    return (value(n) + value(m));
  }

  static int subtract(int n, int m) {
    return (value(n) - value(m));
  }
}

