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
        int[] solution = new int[5];
        int best = CoinChangeDynamic.max_change(40);
        System.out.println(best);
        Assert.assertTrue(best == 2);
    }

    @Test
    public void test_change_100() {
        int[] solution = new int[5];
        int best = CoinChangeDynamic.max_change(10000);
        System.out.println(best);
        //Assert.assertTrue(best == 4);
    }
}