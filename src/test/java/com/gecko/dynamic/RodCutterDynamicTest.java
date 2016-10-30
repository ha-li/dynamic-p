package com.gecko.dynamic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hlieu on 10/29/16.
 */
public class RodCutterDynamicTest {

    @Test
    public void test_1() {
        int best = RodCutterDynamic.best_price(1);
        //System.out.println(best);
        Assert.assertTrue(best == 1);
    }

    @Test
    public void test_2() {
        int best = RodCutterDynamic.best_price(2);
        //System.out.println(best);
        Assert.assertTrue(best == 5);
    }

    @Test
    public void test_3() {
        int best = RodCutterDynamic.best_price(3);

        //System.out.println(best);
        Assert.assertTrue(best == 8);
    }

    @Test
    public void test_10() {
        int best = RodCutterDynamic.best_price(10);

        //System.out.println(best);
        Assert.assertTrue(best == 30);
    }

    @Test
    public void test_11() {
        int best = RodCutterDynamic.best_price(11);

        System.out.println(best);
        Assert.assertTrue(best == 31);
    }

    @Test
    public void test_40() {
        int best = RodCutterDynamic.best_price(40);

        System.out.println(best);
        Assert.assertTrue(best == 120);
    }
}