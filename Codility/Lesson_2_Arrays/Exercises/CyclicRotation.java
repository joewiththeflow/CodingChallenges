package Lesson_2_Arrays.Exercises;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class CyclicRotation {

    // Cyclic Rotation
    
    // Pop the right most number in an array and add it to the front of the array, shifting the other values to the right
    // The standard array method is probably the most straightforward, but the others are included just for info

    // Using a standard array
    public static int[] cycleArray(int[] A, int numberOfRotations) {
        // Check whether there is any need to rotate the array
        if ((A.length < 2) || (numberOfRotations == 0)) {
            return A;
        }

        // Loop through the array K times
        // In each iteration, save the last number in a temp variable
        // Shift every other variable up one place
        for( int i = 0; i < numberOfRotations; i++) {
            int temp = A[A.length - 1];

            // Use the copy function in place
            System.arraycopy(A, 0, A, 1, (A.length - 1));
            A[0] = temp;
        }

        // Just so that we can easily see the result each time we will print them out before returning
        for(int item : A) {
            System.out.print("" + item + ", ");
        }
        System.out.println();

        return A;
    }

    // Using an array list
    public static int[] cycleArrayWithArrayList(int[] A, int numberOfRotations) {
        // Check whether there is any need to rotate the array
        if ((A.length < 2) || (numberOfRotations == 0)) {
            return A;
        }

        // Create an ArrayList with the original array
        ArrayList<Integer> arrayList = new ArrayList<>();
        // Add the values from the original int array to the Integer ArrayList
        for(int intValue : A) {
            arrayList.add(intValue);
        }

        // Loop through the array K times
        // Remove the last int, add it to the first position
        for( int i = 0; i < numberOfRotations; i++) {
            arrayList.add(0, arrayList.remove(arrayList.size() - 1));
        }

        // Update the original array
        for(int i = 0; i < arrayList.size(); i++) {
            A[i] = arrayList.get(i);
        }

        // Just so that we can easily see the result each time we will print them out before returning
        for(int item : A) {
            System.out.print("" + item + ", ");
        }
        System.out.println();

        return A;
    }

    // Using a deque
    public static int[] cycleArrayWithDeque(int[] A, int numberOfRotations) {
        // Check whether there is any need to rotate the array
        if ((A.length < 2) || (numberOfRotations == 0)) {
            return A;
        }

        // Create a Deque with the original array
        Deque<Integer> arrayDeque = new ArrayDeque<>();
        // Add the values from the original int array to the deque
        for(int intValue : A) {
            arrayDeque.add(intValue);
        }

        // Loop through the array K times
        // Remove last int, add it to the first position
        for( int i = 0; i < numberOfRotations; i++) {
            arrayDeque.addFirst(arrayDeque.removeLast());
        }

        // Update the original array and return
        // Use A.length as the condition as the deque size will change as we pop the first item off each time
        for(int i = 0; i < A.length; i++) {
            A[i] = arrayDeque.pop();
        }

        // Just so that we can easily see the result each time we will print them out before returning
        for(int item : A) {
            System.out.print("" + item + ", ");
        }
        System.out.println();

        return A;
    }

    
    public static void main(String[] args) {

        // Test the array method
        cycleArray(new int[] {1,2,3,4,5,6,7,8}, 1);
        cycleArray(new int[] {1,2,3,4,5,6,7,8}, 2);
        cycleArray(new int[] {1,2,3,4,5,6,7,8}, 3);
        cycleArray(new int[] {1,2,3,4,5,6,7,8}, 4);
        cycleArray(new int[] {1,2,3,4,5,6,7,8}, 5);
        cycleArray(new int[] {}, 3);
        cycleArray(new int[] {1}, 3);
        cycleArray(new int[] {-1,2,3,-4,5,6,-7,8}, 3);

        // Test the array list method
        cycleArrayWithArrayList(new int[] {1,2,3,4,5,6,7,8}, 1);
        cycleArrayWithArrayList(new int[] {1,2,3,4,5,6,7,8}, 2);
        cycleArrayWithArrayList(new int[] {1,2,3,4,5,6,7,8}, 3);
        cycleArrayWithArrayList(new int[] {1,2,3,4,5,6,7,8}, 4);
        cycleArrayWithArrayList(new int[] {1,2,3,4,5,6,7,8}, 5);
        cycleArrayWithArrayList(new int[] {}, 3);
        cycleArrayWithArrayList(new int[] {1}, 3);
        cycleArrayWithArrayList(new int[] {-1,2,3,-4,5,6,-7,8}, 3);

        // Test the deque method
        cycleArrayWithDeque(new int[] {1,2,3,4,5,6,7,8}, 1);
        cycleArrayWithDeque(new int[] {1,2,3,4,5,6,7,8}, 2);
        cycleArrayWithDeque(new int[] {1,2,3,4,5,6,7,8}, 3);
        cycleArrayWithDeque(new int[] {1,2,3,4,5,6,7,8}, 4);
        cycleArrayWithDeque(new int[] {1,2,3,4,5,6,7,8}, 5);
        cycleArrayWithDeque(new int[] {}, 3);
        cycleArrayWithDeque(new int[] {1}, 3);
        cycleArrayWithDeque(new int[] {-1,2,3,-4,5,6,-7,8}, 3);
    }
}


// Expected Output

// 8, 1, 2, 3, 4, 5, 6, 7,
// 7, 8, 1, 2, 3, 4, 5, 6,
// 6, 7, 8, 1, 2, 3, 4, 5,
// 5, 6, 7, 8, 1, 2, 3, 4,
// 4, 5, 6, 7, 8, 1, 2, 3,
// 6, -7, 8, -1, 2, 3, -4, 5,
// 8, 1, 2, 3, 4, 5, 6, 7,
// 7, 8, 1, 2, 3, 4, 5, 6,
// 6, 7, 8, 1, 2, 3, 4, 5,
// 5, 6, 7, 8, 1, 2, 3, 4,
// 4, 5, 6, 7, 8, 1, 2, 3,
// 6, -7, 8, -1, 2, 3, -4, 5,
// 8, 1, 2, 3, 4, 5, 6, 7,
// 7, 8, 1, 2, 3, 4, 5, 6,
// 6, 7, 8, 1, 2, 3, 4, 5,
// 5, 6, 7, 8, 1, 2, 3, 4,
// 4, 5, 6, 7, 8, 1, 2, 3,
// 6, -7, 8, -1, 2, 3, -4, 5,