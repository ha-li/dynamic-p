package com.gecko.dynamic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hlieu on 10/29/16.
 */
public class CoinChangeDynamicTest {
    @Test
    public void test_change() {
        int best = CoinChangeDynamic.max_change(85);
        System.out.println(best);
        Assert.assertTrue(best == 4);
    }
}