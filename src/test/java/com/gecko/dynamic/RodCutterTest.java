package com.gecko.dynamic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hlieu on 10/29/16.
 */
public class RodCutterTest {

    @Test
    public void test_4() {
        int best = RodCutter.best_price(4);
        Assert.assertTrue(best == 10);
    }

    @Test
    public void test_10() {
        int best = RodCutter.best_price(10);
        Assert.assertTrue(best == 30);
    }

    @Test
    public void test_11() {
        int best = RodCutter.best_price(11);
        Assert.assertTrue(best == 31);
    }

    @Test
    public void test_30() {
        int best = RodCutter.best_price(30);
        Assert.assertTrue(best == 90);
    }
}