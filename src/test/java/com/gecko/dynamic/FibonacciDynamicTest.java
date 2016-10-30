package com.gecko.dynamic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hlieu on 10/30/16.
 */
public class FibonacciDynamicTest {

    @Test
    public void test_0() {
        int fib = FibonacciDynamic.fibonacciOf(0);
        System.out.println(fib);
        Assert.assertTrue(fib == 0);
    }

    @Test
    public void test_1() {
        int fib = FibonacciDynamic.fibonacciOf(1);
        System.out.println(fib);
        Assert.assertTrue(fib == 1);
    }

    @Test
    public void test_2() {
        int fib = FibonacciDynamic.fibonacciOf(2);
        System.out.println(fib);
        Assert.assertTrue(fib == 2);
    }

    @Test
    public void test_3() {
        int fib = FibonacciDynamic.fibonacciOf(3);
        System.out.println(fib);
        Assert.assertTrue(fib == 6);
    }

    @Test
    public void test_4() {
        int fib = FibonacciDynamic.fibonacciOf(4);
        System.out.println(fib);
        Assert.assertTrue(fib == 24);
    }

    @Test
    public void test_5() {
        int fib = FibonacciDynamic.fibonacciOf(5);
        System.out.println(fib);
        Assert.assertTrue(fib == 120);
    }

}