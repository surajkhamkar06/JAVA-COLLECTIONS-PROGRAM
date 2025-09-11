package package1;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate
{

 // Method to check for duplicates
 public static boolean containsDuplicate(int[] nums)
 {
     Set<Integer> seen = new HashSet<>();

     for (int num : nums) {
         if (seen.contains(num)) {
             return true; // Duplicate found
         }
         seen.add(num);
     }

     return false; // No duplicates
 }

 // Main method to test the logic
 public static void main(String[] args)
 {
     // Sample input array
     int[] nums = {1, 2, 3, 1};

     // Call the method and print result
     boolean result = containsDuplicate(nums);
     System.out.println("Contains Duplicate? " + result);
 }
}