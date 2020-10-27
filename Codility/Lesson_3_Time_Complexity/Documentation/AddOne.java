package Lesson_3_Time_Complexity.Documentation;

public class AddOne {

    // Lesson 3: Time Complexity - Total the numbers in the sequence 1, 2, ... n

    // Fast solution O(n)
    public static int addOneUntilNFast(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }

    // Fastest solution O(1)
    public static int addOneUntilNFastest(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {

        // Fast solution
        System.out.println(addOneUntilNFast(0));
        System.out.println(addOneUntilNFast(1));
        System.out.println(addOneUntilNFast(2));
        System.out.println(addOneUntilNFast(3));
        System.out.println(addOneUntilNFast(4));
        System.out.println(addOneUntilNFast(5));
        System.out.println(addOneUntilNFast(6));

        // Fastest solution
        System.out.println(addOneUntilNFastest(0));
        System.out.println(addOneUntilNFastest(1));
        System.out.println(addOneUntilNFastest(2));
        System.out.println(addOneUntilNFastest(3));
        System.out.println(addOneUntilNFastest(4));
        System.out.println(addOneUntilNFastest(5));
        System.out.println(addOneUntilNFastest(6));
    }
}

// Expected Output

// 0
// 1
// 3
// 6
// 10
// 15
// 21
// 0
// 1
// 3
// 6
// 10
// 15
// 21

