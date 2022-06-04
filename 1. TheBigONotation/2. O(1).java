// This method takes an array of int and print 1st item on the console
// it doesnt matter how big the is the array
// so this method has a single operation and takes a constant amount of time to run
// we dont care the exactly time to run because can vary from 1 machine to another
// all we care about, this method runs in constant time
// The runtime complexity of this method is O(1)
// if we duplicate the println, the runtime complexity is O(2)? yes, but not.
// when talking about the runtime complexity we dont care about the number of operations, just we want to know how much the algorithm slow down as the input grows larger
// in this example if our input array is very large, we just want to know the 1st item

package com.harolddiaz;

public class Main {
    public void log(int[] numbers) {
        System.out.println(numbers[0]);
    }
}
