package com.sandbox.dp;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FibonacciTests {

    private static Fibonacci fibonacci;

    @BeforeAll
    public static void setUp(){
        fibonacci = new Fibonacci();
    }
    @Test
    public void checkForValidScenario_Fibonacci_with_dp(){
        assertTrue(fibonacci.fibonacci_with_dp(0)==0);
        assertTrue(fibonacci.fibonacci_with_dp(1)==1);
        assertTrue(fibonacci.fibonacci_with_dp(2)==1);
        assertTrue(fibonacci.fibonacci_with_dp(3)==2);
        assertTrue(fibonacci.fibonacci_with_dp(4)==3);
    }
    @Test
    public void checkForValidScenario_Fibonacci_without_dp(){
        assertTrue(fibonacci.fibonacci(0)==0);
        assertTrue(fibonacci.fibonacci(1)==1);
        assertTrue(fibonacci.fibonacci(2)==1);
        assertTrue(fibonacci.fibonacci(3)==2);
        assertTrue(fibonacci.fibonacci(4)==3);
    }
}
