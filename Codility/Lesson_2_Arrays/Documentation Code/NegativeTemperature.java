package Lesson_2_Arrays.Documentation;

public class NegativeTemperature {

    // Lesson 2: Arrays - Negative Temperatures in integer array
    
    // Standard for loop
    public static int negativeTemperatures(int[] temperatures) {
        int days = 0;
        for(int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] < 0) {
                days += 1;
            }
        }
        return days;
    }

    // For each type loop
    public static int negativeTemperatures2(int[] temperatures) {
        int days = 0;
        for(int temp : temperatures) {
            if (temp < 0) {
                days += 1;
            }
        }
        return days;
    }
    
    public static void main(String[] args) {

        System.out.println(negativeTemperatures(new int[] {1,2,3,4,5,6}));
        System.out.println(negativeTemperatures(new int[] {-1,2,3,4,5,6}));
        System.out.println(negativeTemperatures(new int[] {-1,-2,3,4,5,6}));
        System.out.println(negativeTemperatures(new int[] {-1,-2,-3,4,5,6}));
        System.out.println(negativeTemperatures(new int[] {-1,-2,-3,-4,5,6}));
        System.out.println(negativeTemperatures(new int[] {-1,-2,-3,-4,-5,6}));

        System.out.println(negativeTemperatures2(new int[] {1,2,3,4,5,6}));
        System.out.println(negativeTemperatures2(new int[] {-1,2,3,4,5,6}));
        System.out.println(negativeTemperatures2(new int[] {-1,-2,3,4,5,6}));
        System.out.println(negativeTemperatures2(new int[] {-1,-2,-3,4,5,6}));
        System.out.println(negativeTemperatures2(new int[] {-1,-2,-3,-4,5,6}));
        System.out.println(negativeTemperatures2(new int[] {-1,-2,-3,-4,-5,6}));
    }
}

// Expected Output

// 0
// 1
// 2
// 3
// 4
// 5
// 0
// 1
// 2
// 3
// 4
// 5
