package com.gecko.dynamic;

/**
 * Created by hlieu on 10/30/16.
 */
public class FibonacciDynamic {

    // calculates the fibonacci value of n by dynamic programming
    public static int fibonacciOf(int n) {
        if(n < 0 ) return -1;

        int[] fib_answer = new int[n+1];

        if(n < 1) { return fib_answer[n]; }

        if(n >= 1) {
            fib_answer[1] = 1;
        }

        for(int i = 2; i < fib_answer.length; i++) {
            fib_answer[i] = i * fib_answer[i-1];
        }

        return fib_answer[n];
    }
}
