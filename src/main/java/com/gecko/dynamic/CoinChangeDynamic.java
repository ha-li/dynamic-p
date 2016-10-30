package com.gecko.dynamic;

/**
 * Created by ha-li on 10/29/16.
 */
public class CoinChangeDynamic {

    private static int[] change = {5, 10, 25};
    private static int NOT_POSSIBLE = 999;

    public static int max_change(int n) {

        // initialize from 0 ... n this will hold our best change solution
        int[] n_cardinality = n_cardinality = new int [n+1];

        // we know that best solution for a value in change[] is 1, so go ahead an initialize that
        for(int i = 0; i < change.length; i++) {
            if(change[i] > n) { continue; }
            n_cardinality[change[i]] = 1;
        }

        // then we calculate the solution dynamically
        return dynamic_min_change(n_cardinality, n);
    }
    // returns -1 if change is not possible
    private static int dynamic_min_change(int[] min_change, int n) {

        // start at i = [1 ... n], make the best change for i using the values in change[]
        for(int i = 1; i <= n; i++) {
            int best = NOT_POSSIBLE;
            for (int j = 0; j < change.length && change[j] <= i; j++) {
                best = min(best, min_change[change[j]] + min_change[i - change[j]]);
            }
            min_change[i] = best;
        }

        // if its not possible, i return -1 as a clear indicator
        return min_change[n] == NOT_POSSIBLE ? -1 : min_change[n];
    }

    /*
    private static int max(int i, int j) {
        if(i > j) { return i; }
        else { return j; }
    } */

    private static int min(int i, int j) {
        if(i < j) { return i; }
        else { return j; }
    }


    /* private static int max_(int[] coins) {
        int max = coins[0];
        for(int i = 1; i < coins.length; i++) {
            if (coins[i] > max) {
                max = coins[i];
            }
        }
        return max;
    } */
}
