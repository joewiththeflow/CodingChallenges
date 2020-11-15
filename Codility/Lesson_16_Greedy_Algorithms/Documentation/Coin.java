package Lesson_16_Greedy_Algorithms.Documentation;

import java.util.HashMap;
import java.util.Map;

public class Coin {

    // Lesson 16 - Greedy Algorithms
    
    // An algorithm which gives the coins used to pay a total K
    // The passed in array M, has the coins to be used in order from lowest to highest
    
    // The interesting thing about this algorithm is that it doesn't necessarily give the minimum number of coins
    // e.g. if K is 6, M is [1,3,4], the algorithm will actually give 4, 1, 1 rather than 3 and 3
    // Supposedly however, it will always be correct for M = [1,2,5]
    
    public static Map<Integer, Integer> greedyCoinChanging(int[] M, int K) {
        // Create a hashmap to record the coins we need
        Map<Integer, Integer> coinCount = new HashMap<>();

        // Set the keys and set initial values to 0
        for (int item : M) {
            coinCount.put(item, 0);
        }

        // Loop over coin array, starting with highest coin first
        for (int i = (M.length - 1); i >= 0; i--) {
            // Ensure K is not 0
            if (K != 0){
                // Integer division to see how many coins we can use for K, bear in mind this could be 0
                coinCount.put(M[i], K / M[i]);
                // Greedy Algorithm, so we gve what's left to the next coin
                K %= M[i];
            }
        }

        return coinCount;
    }
    
    public static void main(String[] args) {

        Map<Integer, Integer> coinMap = greedyCoinChanging(new int[] {1,2,5}, 14);
        coinMap.forEach((key, value) -> System.out.println("coinValue: " + key + " numberRequired: " + value)); // 2 x 2 and 2 x 5
        Map<Integer, Integer> coinMap2 = greedyCoinChanging(new int[] {1,3,4}, 6);
        coinMap2.forEach((key, value) -> System.out.println("coinValue: " + key + " numberRequired: " + value)); // 2 x 1 and 1 x 4 but should be 2 x 3
    }
}

// Expected Output

// coinValue: 1 numberRequired: 0
// coinValue: 2 numberRequired: 2
// coinValue: 5 numberRequired: 2

// coinValue: 1 numberRequired: 2
// coinValue: 3 numberRequired: 0
// coinValue: 4 numberRequired: 1