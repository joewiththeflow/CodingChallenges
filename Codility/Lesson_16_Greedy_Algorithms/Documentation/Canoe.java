package Lesson_16_Greedy_Algorithms.Documentation;

import java.util.ArrayDeque;
import java.util.Deque;

public class Canoe {

    // Lesson 16 - Greedy Algorithms:

    // Canoeists version 1 O(N)

    // Problem: There are n > 0 canoeists weighing respectively 1 <= w0 <= w1 <= . . . <= wn−1 <= 10^9 .
    // The goal is to seat them in the minimum number of double canoes whose displacement (the maximum load) equals k. You may assume that wi <= k.

    // The task can be solved by using a greedy algorithm. The heaviest canoeist is called fatso.
    // Other canoeists who can be seated with fatso in the canoe are called skinny. All the other remaining canoeists are also called fatsos.
    // The idea is that, for the heaviest fatso, we should find the heaviest skinny who can be seated with him.
    // So, we seat together the heaviest fatso and the heaviest skinny. Let us note that the thinner the heaviest fatso is, the fatter skinny can be.
    // Thus, the division between fatso and skinny will change over time — as the heaviest fatso gets closer to the pool of skinnies.
    public static int numberOfDoubleCanoesNeeded(int[] W, int K) {
        // Create a variable to track number of canoes
        int canoes = 0;

        // Create a deque for fatsos and one for skinnys
        Deque<Integer> fatso = new ArrayDeque<>();
        Deque<Integer> skinny = new ArrayDeque<>();

        // Loop through the weights in the W array, except the last weight
        for (int i =0; i < (W.length - 1); i++) {
            // If current weight plus the heaviest weight is less than or equal to K
            if (W[i] + W[W.length - 1] <= K) {
                // The weight is a skinny, so append to skinny deque
                skinny.addLast(W[i]);
            } else {
                // The weight is a fatso, so add to the fatso deque
                fatso.addLast(W[i]);
            }
        }
        // Add the last weight to the fatso deque
        fatso.addLast(W[W.length - 1]);

        // Loop while there is at least one skinny or fatso left
        while ((!skinny.isEmpty()) || (!fatso.isEmpty())) {
            // If length of skinny is greater than 0
            if (skinny.size() > 0) {
                // Remove the last element of skinny
                skinny.removeLast();
            }
            // Remove the last fatso
            fatso.removeLast();
            // We've used up the largest skinny and largest fatso, so add one to the number of canoes
            canoes += 1;

            // If fatso is empty, and there are elements left in skinny
            if(fatso.isEmpty() && !skinny.isEmpty()) {
                // remove the last element from skinny, and add it to fatso
                fatso.add(skinny.removeLast());
            }
            // While fatso has more than one element AND the last fatso plus the first fatso are less than or equal to K
            while ( fatso.size() > 1 && ((fatso.getLast() + fatso.getFirst()) <= K) ) {
                // Add the smallest fatso to the end of the skinny deque
                skinny.addLast(fatso.removeFirst());
            }
        }
        return canoes;
    }

    // Lesson 16 - Greedy Algorithms: Canoeists version 2 O(N)
    // The fattest canoeist is seated with the thinnest, as long as their weight is less than or equal to k.
    // If not, the fattest canoeist is seated alone in the canoe.

    public static int numberOfDoubleCanoesNeededVersion2(int[] W, int K) {
        // Create a variable to track number of canoes
        int canoes = 0;

        // Create variables for the loop
        int j = 0;
        int i = W.length - 1;

        // Loop while i is greater than or equal to j
        while (i >= j) {
            // If the current fatso plus the current thinnest is less than or equal to K
            if (W[i] + W[j] <=K) {
                // Increment J as we have seated this person in a canoe successfully
                j++;
            }
            // Increment the number of canoes
            canoes += 1;
            // Regardless of whether we were able to sit a thin person on the canoe, a fatso will be seated so decrement
            i--;
        }
        return canoes;
    }


    public static void main(String[] args) {

        // Version 1
        System.out.println(String.format("Number of canoes needed: %d", numberOfDoubleCanoesNeeded(new int[] {1,2,3,4,5,6,7,8,9,10}, 15))); // 5

        // Version 2
        System.out.println(String.format("Number of canoes needed: %d", numberOfDoubleCanoesNeededVersion2(new int[] {1,2,3,4,5,6,7,8,9,10}, 15)));
    }
}

// Expected Output

// Number of canoes needed: 5
// Number of canoes needed: 5
