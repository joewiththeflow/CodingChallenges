// Lesson 1: Iterations - How many digits in decimal number only using arithmetic operations

func howManyDigitsInNumber(n: Int) -> Int {
        var result = 0
        var remainingNumber = n
        while (remainingNumber > 0) {
            remainingNumber /= 10;
            result += 1;
        }
        return result;
}

// Test output

print(howManyDigitsInNumber(n: 9))      // 1
print(howManyDigitsInNumber(n: 99))     // 2
print(howManyDigitsInNumber(n: 999))    // 3
print(howManyDigitsInNumber(n: 9999))   // 4
print(howManyDigitsInNumber(n: 99999))  // 5
