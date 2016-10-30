package com.gecko.dynamic;

/**
 * Created by ha-li on 10/29/16.
 */
public class CoinChangeDynamic {

    //private static int[] change = {5, 10, 15, 20};
    private static int NOT_POSSIBLE = 999;

    // modify to allow user to pass in the list of coin_types
    // n is the number you want the change for,
    // coin_types is an array of your coins, eg {5, 10, 20}
    // e.g.
    // int[] coin_types = {5, 10, 15, 20};
    // int best = CoinChangeDynamic.max_change( 40, coin_types );
    //
    public static int max_change(int n, int[] coin_types) {

        // initialize from 0 ... n this will hold our best change solution
        int[] n_cardinality = n_cardinality = new int [n+1];
        int[] solution = new int[n+1];

        // we know that best solution for a value in change[] is 1, so go ahead an initialize that
        for(int i = 0; i < coin_types.length; i++) {
            if(coin_types[i] > n) { continue; }
            n_cardinality[coin_types[i]] = 1;
            solution[coin_types[i]] = coin_types[i];
        }

        // then we calculate the solution dynamically
        int retValue = dynamic_min_change(n_cardinality, coin_types, solution, n);
        displaySolution(solution, n);
        return retValue;
    }

    private static void displaySolution(int[] solution, int n) {
        int i = n;
        System.out.println("coins:" );
        while (i > 0) {
            System.out.print(solution[i] + ", ");
            i = i-solution[i];
        }
        System.out.println();
    }

    // returns -1 if change is not possible
    private static int dynamic_min_change(int[] min_change, int[] coin_types, int[] solution, int n) {

        // start at i = [1 ... n], make the best change for i using the values in change[]
        for(int i = 1; i <= n; i++) {
            int best = NOT_POSSIBLE;
            for (int j = 0; j < coin_types.length && coin_types[j] <= i; j++) {
                if( best > min_change[coin_types[j]] + min_change[i - coin_types[j]] ) {
                    best = min_change[coin_types[j]] + min_change[i - coin_types[j]];
                    solution[i] = coin_types[j];// min_change[i - change[j]];
                }
                //best = min(best, min_change[change[j]] + min_change[i - change[j]]);
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
