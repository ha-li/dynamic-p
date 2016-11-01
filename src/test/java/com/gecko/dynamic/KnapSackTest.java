package com.gecko.dynamic;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hlieu on 10/31/16.
 */
public class KnapSackTest {
    @Test
    public void test_basic() {
        int val[] = new int[]{60, 100, 120};
        int wt[] = new int[]{10, 20, 30};
        int  W = 50;
        int n = val.length;
        int best = KnapSack.knapSack(W, wt, val, n);
        System.out.println(best);
    }
}