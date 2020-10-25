public class BinaryGap {

    // Binary Gap
    // Find longest sequence of zeros in binary representation of an integer.
    public static int binaryGap(int N) {

        // Variable representing the current max gap
        int max = 0;
        // Variable representing current 0s
        int numCurrentZeros = 0;
        // Need a boolean to indicate that we have already seen a 1 or not
        boolean hasAOneBeenSeen = false;
        // Need to convert the current integer to a binary string
        String binaryString = Integer.toBinaryString(N);

        // Loop through the binary string
        for(int i = 0; i < binaryString.length(); i++) {
            // If a 1 has already been seen, check if string character is 1 or 0
            if(hasAOneBeenSeen) {
                switch (binaryString.charAt(i)) {
                    case '0':
                        // If the current character is 0, add one to the numCurrentZeros
                        numCurrentZeros += 1;
                        break;
                    case '1':
                        // If the current character is 1, check to see if numCurrentZeros > max
                        if (numCurrentZeros > max) {
                            max = numCurrentZeros;
                        }
                        // Reset numCurrentZeros
                        numCurrentZeros = 0;
                        break;
                    default:
                        break;
                }
            } else {
                // If the number is a '1', set the hasAOneBeenSeen to true
                if (binaryString.charAt(i) == '1') {
                    hasAOneBeenSeen = true;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {

        System.out.println(binaryGap(1));       // 1
        System.out.println(binaryGap(2));       // 10
        System.out.println(binaryGap(3));       // 11
        System.out.println(binaryGap(15));      // 1111
        System.out.println(binaryGap(89));      // 1011001
        System.out.println(binaryGap(150));     // 10010110
        System.out.println(binaryGap(350));     // 101011110
        System.out.println(binaryGap(1000));    // 1111101000
        System.out.println(binaryGap(10000));   // 10011100010000
    }
}

// Expected Output

// 0
// 0
// 0
// 0
// 2
// 2
// 1
// 1
// 3
