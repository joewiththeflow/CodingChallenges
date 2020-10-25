public class Decimal {

    // Lesson 1: Iterations - How many digits in decimal number only using arithmetic operations

    public static int howManyDigitsInNumber(int n) {
        int result = 0;
        while (n > 0) {
            n /= 10;
            result += 1;
        }
        return result;
    }

    // Test output
    public static void main(String[] args) {

        System.out.println(howManyDigitsInNumber(9));       // 1
        System.out.println(howManyDigitsInNumber(99));      // 2
        System.out.println(howManyDigitsInNumber(999));     // 3
        System.out.println(howManyDigitsInNumber(9999));    // 4
        System.out.println(howManyDigitsInNumber(99999));   // 5
    }
}
