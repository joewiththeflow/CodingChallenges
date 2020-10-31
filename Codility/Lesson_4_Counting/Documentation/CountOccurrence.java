package Lesson_4_Counting;

public class CountOccurrence {

    // Lesson 4 - Counting
    // Return an array with the counts of specific numbers in their respective index, based on an original array
    // i.e. we are creating and returning an array of counts of specific numbers in the original array
    // Maximum value of any specific integer is m.
    // Be aware that this could cause problems due to memory - personally I think a hashmap is better.
    public static int[] getCountArray(int[] A, int m) {
        int length = A.length;
        int[] countArray = new int[m + 1]; // including 0
        for (int i = 0; i < length; i++) {
            countArray[A[i]] += 1;
        }
        return countArray;
    }

    public static void main(String[] args) {

        // Test count array method
        int[] countArray = getCountArray(new int[] {0,1,0,1,2,3,4,5,5,5,6,5,5,7,8,9,4,10},12);
        for (int i = 0; i < countArray.length; i++) {
            System.out.println(String.format("Number: %d, Count: %d", i, countArray[i]));
        }
    }
}

// Expected Output

// Number: 0, Count: 2
// Number: 1, Count: 2
// Number: 2, Count: 1
// Number: 3, Count: 1
// Number: 4, Count: 2
// Number: 5, Count: 5
// Number: 6, Count: 1
// Number: 7, Count: 1
// Number: 8, Count: 1
// Number: 9, Count: 1
// Number: 10, Count: 1
// Number: 11, Count: 0
// Number: 12, Count: 0
