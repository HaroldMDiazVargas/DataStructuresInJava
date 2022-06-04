
// The Logarithmic curve compared with Linear curve, this last one grows at the same way but Log curve slow downs at some point
// algorithms run in Log time are more efficient and more scalable that algorithms that run in Linear or Quadratic time

// Example. Lets say we have an array of sorted numbers from 1-10. We want to find the number 10
//          One way to find the 10 is to iterate the array using a for loop => going forward until we find the 10 => LINEAR SEARCH(algorithm) because works in linear time
//              in the worst scenario if the number we are looking for is at the end of the array => we have to inspect every cell
//              the more items we have, the longer this operation is going to take => the runtime of this algorithm increases Linearly and in Direct proportin of the size of our array
//          Another way is to use BINARY SEARCH algorithm => this algorithm runs in Logarithmic time, so is faster than the Linear Search
//              we start by looking at the middle item, if this item is smaller or greater than value we are looking for => if smaller, so our target number must be in the right or left partition                                           
//              so we narrow down our search by half, an in the new partition we looking at the middle item => again apply the same concept and focus on one partition
//              in each search we are search by half => so if we have 1M items we can find a target item with a maximum 19 comparison

// we have logarithmic grows in algorithms where we reduce our work by half in every step
// we dont see in code yet
