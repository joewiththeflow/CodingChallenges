public class SymmetricTriangle {

    // Lesson 1: Iterations - Symmetrical Triangle Example

    public static void symmetricalTriangle(int n) {
        // Loop downwards from n to 1
        for(int i = n; i >= 1; i--) {

            // Print indentation spaces - more space as i gets smaller
            for(int j = 0; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Print asterisks - more when i is bigger
            for(int j = 0; j < ((2 * i) - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        symmetricalTriangle(1);
        symmetricalTriangle(2);
        symmetricalTriangle(3);
        symmetricalTriangle(4);
        symmetricalTriangle(5);
        symmetricalTriangle(6);
    }
}

// Expected Output

// *
// ***
//  *
// *****
//  ***
//   *
// *******
//  *****
//   ***
//    *
// *********
//  *******
//   *****
//    ***
//     *
// ***********
//  *********
//   *******
//    *****
//     ***
//      *