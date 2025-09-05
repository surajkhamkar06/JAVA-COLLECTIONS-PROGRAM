package package2;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 2, 3, 4, 4, 5};

        // Step 1: Convert array to List
        List<Integer> list = new ArrayList<>();
        for (int num : inputArray) {
            list.add(num);
        }

        // Step 2: Use LinkedHashSet to remove duplicates and preserve order
        Set<Integer> uniqueSet = new LinkedHashSet<>(list);

        // Step 3: Convert Set back to array
        int[] resultArray = new int[uniqueSet.size()];
        int i = 0;
        for (int num : uniqueSet) {
            resultArray[i++] = num;
        }

        // Step 4: Print result
        System.out.println("Array after removing duplicates: " + Arrays.toString(resultArray));
    }
}