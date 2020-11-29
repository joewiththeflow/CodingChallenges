
// Lesson 1: Iterations - Fibonacci sequence

func fibonacci(n: Int) {
    var a = 0
    var b = 1
    var text = ""
    while ( a <= n) {
        text += "\(a), "
        let c = a + b
        a = b
        b = c
    }
    print(text)
}

fibonacci(n: 1)
fibonacci(n: 2)
fibonacci(n: 3)
fibonacci(n: 4)
fibonacci(n: 5)
fibonacci(n: 6)
fibonacci(n: 7)
fibonacci(n: 8)
fibonacci(n: 9)
fibonacci(n: 10)
fibonacci(n: 100)
fibonacci(n: 1000)


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
