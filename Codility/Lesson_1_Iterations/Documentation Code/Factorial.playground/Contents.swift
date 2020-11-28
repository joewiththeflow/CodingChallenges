// Lesson 1: Iterations - Factorial Example

    // Loop method
func factorial(n: Int) -> Int {
        var factorial = 1;

    for i in 1...n {
        factorial *= i;
    }
    return factorial;
}

// Alternative could be to use recursion
func factorialUsingRecursion(n: Int) -> Int {
    if (n == 1) {
        return 1;
    } else {
        return n * factorialUsingRecursion(n: (n - 1));
    }
}

// Test the first method
print("The factorial of 1 is: %d \(factorial(n: 1))")  // 1
print("The factorial of 1 is: \(factorial(n: 2))")   // 2
print("The factorial of 1 is: \(factorial(n: 3))")   // 6
print("The factorial of 1 is: \(factorial(n: 4))")   // 24
print("The factorial of 1 is: \(factorial(n: 5))")   // 120


// Test the recursive method
print("The factorial of 1 is: \(factorialUsingRecursion(n: 1))")     // 1
print("The factorial of 1 is: \(factorialUsingRecursion(n: 2))")      // 2
print("The factorial of 1 is: \(factorialUsingRecursion(n: 3))")      // 6
print("The factorial of 1 is: \(factorialUsingRecursion(n: 4))")      // 24
print("The factorial of 1 is: \(factorialUsingRecursion(n: 5))")      // 120

