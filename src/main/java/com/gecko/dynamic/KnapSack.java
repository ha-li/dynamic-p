package com.gecko.dynamic;

/**
 * Created by hlieu on 10/31/16.
 */
public class KnapSack
{

    // A utility function that returns maximum of two integers
    private static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int knapSack(int W, int wt[], int val[], int n)
    {
        // our dynamic structure, at each iteration, we consider
        // for i = each incremental item to consider
        // for each w, weight to consider
        // so for example at i = 0, we do not consider any of the item to put
        // into the knapsack capable of holding w = 24 lbs

        // when i = 1, we consider only the first item at w = 0...50
        // when i = 2, we consider the effect of the 2nd item, at weight w
        // it is either we add the 2nd item and the val of the left over space
        // or we don't add the new item....
        int K[][] = new int[n+1][W+1];

        return _knapSack(W, wt, val, K);
    }

    // Returns the maximum value that can be put in a knapsack of capacity W
    public static int _knapSack(int W, int wt[], int val[], int[][] K)
    {

        // our dynamic structure, at each iteration, we consider
        // for i = each incremental item to consider
        // for each w, weight to consider
        // so for example at i = 0, we do not consider any of the item to put
        // into the knapsack capable of holding w = 24 lbs

        // Build table K[][] in bottom up manner
        for (int i = 0; i <= val.length; i++)
        {
            for (int w = 0; w <= W; w++)
            {
                if (i==0 || w==0) {

                    K[i][w] = 0;
                } else if (wt[i-1] <= w) {
                    // since item i-1 is less then the current weight limit, we
                    // can consider it, we already computed the best answer when
                    // we do not include item i-1 (during i-1-1 iteration)
                    // so now we just need to consider the effect of i-1 in the knapsack

                    // here we take the val of the the new item + the value of the left over
                    // space, against the value of the knapsack without the new item
                    // and we get the max of that
                    K[i][w] = max(val[i - 1] + K[i - 1][w - wt[i - 1]], K[i - 1][w]);
                } else {

                    // can't add the new item cause it's too heavy for the knapsack of weight w
                    K[i][w] = K[i - 1][w];
                }
            }
        }

        //
        return K[val.length][W];
    }
}
