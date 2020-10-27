package Lesson_3_Time_Complexity.Exercises;

public class FrogJump {

    // Frog Jumps
    // Minimum number of jumps needed between X and Y, when jumping same distance D
    public static int minimumNumberOfJumpsNeeded(int X, int Y, int D) {
        // Get the distance we need to cover
        int differenceBetweenXAndY = Y - X;

        if (differenceBetweenXAndY % D == 0) {
            // Perfect division
            return differenceBetweenXAndY / D;
        } else {
            // We need an extra jump
            return (differenceBetweenXAndY / D) + 1;
        }
    }
    
    public static void main(String[] args) {

        System.out.println(String.format("Minimum jumps needed: %s", minimumNumberOfJumpsNeeded(10, 85, 10)));
        System.out.println(String.format("Minimum jumps needed: %s", minimumNumberOfJumpsNeeded(10, 85, 15)));
        System.out.println(String.format("Minimum jumps needed: %s", minimumNumberOfJumpsNeeded(10, 85, 20)));
        System.out.println(String.format("Minimum jumps needed: %s", minimumNumberOfJumpsNeeded(10, 85, 30)));
        System.out.println(String.format("Minimum jumps needed: %s", minimumNumberOfJumpsNeeded(10, 85, 100)));
        System.out.println(String.format("Minimum jumps needed: %s", minimumNumberOfJumpsNeeded(10, 850, 10)));
        System.out.println(String.format("Minimum jumps needed: %s", minimumNumberOfJumpsNeeded(10, 8500, 10)));
        System.out.println(String.format("Minimum jumps needed: %s", minimumNumberOfJumpsNeeded(10, 850, 30)));
    }
}

// Expected Output

// Minimum jumps needed: 8
// Minimum jumps needed: 5
// Minimum jumps needed: 4
// Minimum jumps needed: 3
// Minimum jumps needed: 1
// Minimum jumps needed: 84
// Minimum jumps needed: 849
// Minimum jumps needed: 28
