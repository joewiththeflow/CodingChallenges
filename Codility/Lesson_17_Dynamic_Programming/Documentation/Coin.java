package Lesson_17_Dynamic_Programming;

public class Coin {

    public static int[] dynamicCoinChanging(int [] denominations, int K) {

        // Create a row representing the first row in a dynamic programming table
        int[] dp = new int[K+1];
        // Set the value for every position apart from 0 to MAX_VALUE
        for (int i = 1; i < dp.length; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        // Loop from 1 to length of denominations
        for (int i = 1; i <= denominations.length; i++) {
            // Loop from first denomination to K
            for (int j = denominations[i-1]; j <= K; j++) {
                // Set j position's value in row to minimum of:
                // - dp position[j - denomination value - 1] + 1 i.e. the value in the array which is the same number
                // of places behind the current j position as the value of the denomination.
                // - dp[j] - the current position.
                // The reason being is that the best value has already been worked out for that previous value and we
                // can just add 1 on to that as the current value only needs one extra coin
                // (the current denomination value) at minimum to reach the current value in the array.
                dp[j] = Math.min(dp[j - denominations[i - 1]] + 1, dp[j]);
            }
        }

        return dp;
    }

    public static void main(String[] args) {

        int[] coinsNeeded = dynamicCoinChanging(new int[] {1,3,4}, 6);
        for (int i = 0; i < coinsNeeded.length; i++) {
            System.out.println(String.format("Minimum number of coins needed for %d is: %d", i, coinsNeeded[i]));
        }
    }
}

// Expected Output

// Minimum number of coins needed for 0 is: 0
// Minimum number of coins needed for 1 is: 1
// Minimum number of coins needed for 2 is: 2
// Minimum number of coins needed for 3 is: 1
// Minimum number of coins needed for 4 is: 1
// Minimum number of coins needed for 5 is: 2
// Minimum number of coins needed for 6 is: 2
