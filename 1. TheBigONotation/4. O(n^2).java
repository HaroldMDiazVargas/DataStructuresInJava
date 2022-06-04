// Nested loops
// This algorithm is used for printing all combinations of items in an array
// in our alter loop we are iterate over the input array => we have O(n)
// in each iteration we are iterating over all the items in this array => O(n)
// the runtime complexity is O(n * n) => O(n^2) => this algorithm runs in Quadratic time
// algorithms that runs in Quadratic time are slower than algorithms that runs of O(n)
//  but this will depend of the input size

// if we add another loop making the runtime complexity O(n + n^2)
//  we can simplify, the square of a number is always greater than the number itself
//  the square always grows faster than n, we use the big O notation to understand how the cost of algorithm increases
//  all we need is an approximation not an exact value, so here we can drop n => conclude that this method runs in O(n^2) 

// if we add another nested loop, the runtime complexity is now O(n^3)
//  this algorithm is far slow that O(n^2)

package com.harolddiaz;

public class Main {

    public void log(int[] numbers) {

        for (int number : numbers)
            System.out.println(number);

        for (int first : numbers)
            for (int second : numbers) {
                System.out.println(first + ", " + second);
                for (int third : numbers)
                    System.out.println(third);
            }
    }

}