package Lesson_2_Arrays.Documentation;

public class AddArray {

    // Lesson 2: Arrays - Add two arrays together

    // To do this in Java, we must create a new array

    public static void addTwoArrays(int[] A, int[] B) {
        int lengthOfA = A.length;
        int lengthOfB = B.length;

        // Create new array of correct size
        int[] C = new int[lengthOfA + lengthOfB];

        // Copy the contents of A to the new array, starting at position 0 in the new array
        System.arraycopy(A, 0, C, 0, lengthOfA);
        // Copy the contents of B to the new array, starting at the position just after the last element of A
        System.arraycopy(B, 0, C, lengthOfA, lengthOfB);

        // Print each element in the array to show correctness
        for(int item : C) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {

        addTwoArrays(new int[] {1,2,3,4,5,6,7}, new int[] {2,4,6,8,10});
        addTwoArrays(new int[] {1,2,3}, new int[] {2,4,6,8,10});
    }
}

// Expected Output

// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 2
// 4
// 6
// 8
// 10
// 1
// 2
// 3
// 2
// 4
// 6
// 8
// 10
