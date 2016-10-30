package com.gecko.dynamic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ha-li on 10/29/16.
 */
public class CoinChangeDynamicTest {
    @Test
    public void test_change() {
        int[] coin_types = {5, 10, 15, 20};
        int best = CoinChangeDynamic.max_change(40, coin_types);
        System.out.println(best);
        Assert.assertTrue(best == 2);
    }

    @Test
    public void test_change_100() {
        int[] coin_types = {5, 10, 15, 25, 100};
        int best = CoinChangeDynamic.max_change(10000, coin_types);
        System.out.println(best);
    }
}