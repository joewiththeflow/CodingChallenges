// Lesson 1: Iterations - Triangle Example

// Nested Loop method
func triangle(n: Int) {
    
    for i in 1...n {
        var text = ""
        for _ in 1...i {
            text += "*"
        }
        print(text)
    }
}

triangle(n: 1)
triangle(n: 2)
triangle(n: 3)
triangle(n: 4)
triangle(n: 5)
triangle(n: 6)


// Expcted Output

// *
// *
// **
// *
// **
// ***
// *
// **
// ***
// ****
// *
// **
// ***
// ****
// *****
// *
// **
// ***
// ****
// *****
// ******

