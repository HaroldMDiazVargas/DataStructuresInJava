// In this example we are iterating over all items in the array and print each item on the console
// this is where the size of the input matters
// the cost of this algorithm grows Linearly an in direct correlation to the size of the input
// we represent the runtime complexity of this method using Big O(n), where n represent the size of the input
// in this algorithm we could also use for each loop, while, do while.
// If we use a single print statement after the loop, the runtime complexity is O(n+1) => O(n)
// when using the Big notation we drop the constant in this case, because doesn't matter
// reason => if our array has 1 million items, has an extra print doesn't have a significant impact to the cost of our algorithm
//          the cost of our algorithm still increases linearly
// if we have 2 loops in the methods => the runtime complexity is going to be O(n + n) => O(2n)
//  this is other example when we drop the constant, because all we need here is the approximation of the cost of this algorithm relative to its input size
//  so, O(n) or O(2n) still represent a linear grows
// if the method has 2 arguments => array of numbers and an array of strings
//  the runtime complexity is going to be O(n + m), because we are dealing with different arrays
//  but once again we can simplify to O(n), because the runtime of this method increases linearly
package com.harolddiaz;

public class Main {
    public void log(int[] numbers) {
        for (int i = 0; i < numbers.length; i++)
            System.out.println(numbers[i]);
    }

}