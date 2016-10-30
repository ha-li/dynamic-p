package com.gecko.dynamic;

/**
 * Created by hlieu on 10/29/16.
 */
// this is the dynamic programming solution to rod cutter
public class RodCutterDynamic {


    // the price of rodes of length i for i = 0 - 10
    private static Integer[] price_index = {
            0, // price of a rode of length 0, naturally
            1, // rod of length 1 is $1
            5, // rod of length 2 is $5
            8, // length 3 is $8
            9, // length 4 is $9
            10, // length of 5 is $10
            17, // length of 6 is $17
            17, // 7 is $17
            20, // 8 is $20
            24, // 9 is $24
            30  // length of 10 is $30
    };

    public static int best_price(int n){
        int[] subs_ = new int[n+1];
        for(int i = 0; i < subs_.length; i++) {
            subs_[i] = -1;
        }

        return memoized_best_price(subs_, n);
    }

    private static int max(int i, int j) {
        if (i > j) { return i; }
        else       { return j; }
    }

    private static int memoized_best_price(int[] memos, int n) {
        memos[0] = 0;


        for(int j = 1; j <= n; j++) {
            int best_price = -1;

            // we only have price index for 1 .. 10
            int stop = min(j, 10);
            for(int i = 1; i <= stop; i++) {
                // the best price is the max of
                // (running best price), and the (price of i + the best price of j-i)
                best_price = max(best_price, price_index[i] + memos[j-i]);
            }
            memos[j] = best_price;
        }
        return memos[n];
    }

    private static int min(int i, int j) {
        if( i < j ) {return i; }
        else {return j;}
    }
}
