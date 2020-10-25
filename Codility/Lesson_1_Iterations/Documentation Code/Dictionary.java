import java.util.HashMap;
import java.util.Map;

public class Dictionary {

    // Lesson 1: Iterations - Print key and value for Map

    // Use Hashmap and keySet
    public static void namesAndNumbersMap() {
        Map<Integer, String> namesMap = new HashMap<>();
        namesMap.put(1, "Larry");
        namesMap.put(2, "Steve");
        namesMap.put(3, "James");

        for (int key : namesMap.keySet()) {
            System.out.println("key: " + key + " value: " + namesMap.get(key));
        }
    }

    // Use HashMap and For Each loop
    public static void namesAndNumbersMapUsingForEach() {
        Map<Integer, String> namesMap = new HashMap<>();
        namesMap.put(1, "Larry");
        namesMap.put(2, "Steve");
        namesMap.put(3, "James");

        namesMap.forEach((key, value) -> System.out.println("key: " + key + " value: " + value));
    }

    public static void main(String[] args) {

        namesAndNumbersMap();
        namesAndNumbersMapUsingForEach();
    }
}

// Expected Output

// key: 1 value: Larry
// key: 2 value: Steve
// key: 3 value: James
// key: 1 value: Larry
// key: 2 value: Steve
// key: 3 value: James
