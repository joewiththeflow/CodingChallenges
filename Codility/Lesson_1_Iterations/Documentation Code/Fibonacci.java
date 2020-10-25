public class Fibonacci {

    // Lesson 1: Iterations - Fibonacci sequence
    public static void fibonacci(int n) {
        int a = 0;
        int b = 1;
        while ( a <= n) {
            System.out.print(String.format("%d, ", a));
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        fibonacci(1);
        fibonacci(2);
        fibonacci(3);
        fibonacci(4);
        fibonacci(5);
        fibonacci(6);
        fibonacci(7);
        fibonacci(8);
        fibonacci(9);
        fibonacci(10);
        fibonacci(100);
        fibonacci(1000);
    }
}

// Expected Output

// 0, 1, 1,
// 0, 1, 1, 2,
// 0, 1, 1, 2, 3,
// 0, 1, 1, 2, 3,
// 0, 1, 1, 2, 3, 5,
// 0, 1, 1, 2, 3, 5,
// 0, 1, 1, 2, 3, 5,
// 0, 1, 1, 2, 3, 5, 8,
// 0, 1, 1, 2, 3, 5, 8,
// 0, 1, 1, 2, 3, 5, 8,
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987,