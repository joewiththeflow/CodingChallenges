import java.util.ArrayList;
import java.util.Arrays;

public class WeekDay {

    // Lesson 1: Iterations - Loop over an array and arrayList and print out each value

    // Use String array
    public static void daysOfWeek() {
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // Use a for loop for an array of strings
        for (String day : daysOfWeek) {
            System.out.println(day);
        }

    }

    // Alternatively use an ArrayList (convoluted, but just to show how it could be done)
    public static void daysOfWeekUsingArrayList() {
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // Create an ArrayList collection using the original String array
        ArrayList<String> daysOfWeek2 = new ArrayList<>(Arrays.asList(daysOfWeek));
        // Use the forEach collection method to print out each day using a lambda expression
        daysOfWeek2.forEach(day -> System.out.println(day));
    }

    public static void main(String[] args) {

        // Test using String Array
        daysOfWeek();
        // Test using ArrayList
        daysOfWeekUsingArrayList();
    }
}

// Expected Output

// Monday
// Tuesday
// Wednesday
// Thursday
// Friday
// Saturday
// Sunday
// Monday
// Tuesday
// Wednesday
// Thursday
// Friday
// Saturday
// Sunday
