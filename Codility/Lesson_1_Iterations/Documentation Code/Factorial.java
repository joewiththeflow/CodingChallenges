public class Factorial {

    // Lesson 1: Iterations - Factorial Example

    // Loop method
    public static int factorial(int n) {
        int factorial = 1;

        for(int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // Alternative could be to use recursion
    public static int factorialUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // Tests and output
    public static void main(String[] args) {

        // Test the first method
        System.out.println("---Factorials using loop method---\n");
        System.out.println(String.format("The factorial of 1 is: %d", factorial(1)));   // 1
        System.out.println(String.format("The factorial of 2 is: %d", factorial(2)));   // 2
        System.out.println(String.format("The factorial of 3 is: %d", factorial(3)));   // 6
        System.out.println(String.format("The factorial of 4 is: %d", factorial(4)));   // 24
        System.out.println(String.format("The factorial of 5 is: %d", factorial(5)));   // 120


        // Test the recursive method
        System.out.println("\n---Factorials using recursive method---\n");
        System.out.println(String.format("The factorial of 1 is: %d", factorialUsingRecursion(1)));     // 1
        System.out.println(String.format("The factorial of 2 is: %d", factorialUsingRecursion(2)));     // 2
        System.out.println(String.format("The factorial of 3 is: %d", factorialUsingRecursion(3)));     // 6
        System.out.println(String.format("The factorial of 4 is: %d", factorialUsingRecursion(4)));     // 24
        System.out.println(String.format("The factorial of 5 is: %d", factorialUsingRecursion(5)));     // 120
    }
}
