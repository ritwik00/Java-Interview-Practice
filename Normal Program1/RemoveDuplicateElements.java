import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateElements {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 2, 5, 6, 3};

        // Sort the array
        Arrays.sort(array);

        // Create a set to store the unique elements
        HashSet<Integer> set = new HashSet<>();

        // Iterate through the array and add the unique elements to the set
        for (int element : array) {
            set.add(element);
        }

        // Iterate through the set and print the unique elements
        for (int element : set) {
            System.out.println(element);
        }
    }
}