package test;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        
        // Create a list of integers from the array
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        
        // Partition the list into even and odd elements
        List<Integer> even = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        List<Integer> odd = list.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
        
        // Interchange positions of even and odd elements
        int size = Math.max(even.size(), odd.size());
        for (int i = 0; i < size; i++) {
            if (i < even.size()) {
                list.set(2 * i, even.get(i));
            }
            if (i < odd.size()) {
                list.set(2 * i + 1, odd.get(i));
            }
        }
        
        // Convert the list back to an array
        int[] rearrangedArray = list.stream().mapToInt(Integer::intValue).toArray();
        
        // Print the rearranged array
        System.out.println(Arrays.toString(rearrangedArray));
    }
}
