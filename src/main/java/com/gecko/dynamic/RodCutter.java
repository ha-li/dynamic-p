package com.gecko.dynamic;

/**
 * Created by ha-li on 10/29/16.
 */
// a brute force way of solving the rod cutter problem
public class RodCutter {
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

    // returns the price of a rod of length n for n = 0 ... 10
    private static int price_n(int n) {
        return price_index[n];
    }

    private static int max(int i, int j) {
        if( i < j ) { return j; }
        else return i;
    }
    private static int min(int i, int j) {
        if(i < j) return i;
        else return j;
    }

    // returns the best price for a rod of length n
    public static int best_price (int n) {
        //int best_price = 0;
        if(n == 0) { return 0; }

        int best_price=-1;

        // this is our stopping condition for the for loop
        // because for i > 10, there is no corresponding price_index value
        int stop = min(n, 10);
        for (int i = 1; i <= stop; i++) {
            best_price = max(best_price, price_n(i) + best_price(n-i));
        }
        // the best price
        return best_price;
    }


}
