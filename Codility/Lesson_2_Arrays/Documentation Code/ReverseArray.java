package Lesson_2_Arrays.Documentation;

public class ReverseArray {

    // Lesson 2: Arrays - Reverse an array

    public static void reverseArray(int[] A) {
        // Swap the first and last elements of the array, then the second and second-last and so on...

        int arrayLength = A.length;
        // We can divide by 2
        // If the array length is odd, the middle value will still be the middle value
        for( int i = 0; i < (arrayLength / 2); i++) {
            int temp = A[i];
            A[i] = A[(arrayLength - 1) - i];
            A[(arrayLength - 1) - i] = temp;
        }

        // Print out to show correctness
        for(int item : A) {
            System.out.print(item);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        reverseArray(new int[] {1,2,3,4,5,6,7,8,9,10});
        reverseArray(new int[] {10,9,8,7,6,5,4,3,2,1});
    }
}

// Expected Output

// 10987654321
// 12345678910
