// Lesson 1: Iterations - Print key and value for Map

func namesAndNumbersDictionary() {
    let namesMap = [
        1 : "Larry",
        2 : "Steve",
        3 : "James"
    ]
    
    for (key, value) in namesMap {
        print("key: \(key) + value: \(value)")
    }
}

namesAndNumbersDictionary()

// Expected Output (in no order)

// key: 1 + value: Larry
// key: 2 + value: Steve
// key: 3 + value: James
