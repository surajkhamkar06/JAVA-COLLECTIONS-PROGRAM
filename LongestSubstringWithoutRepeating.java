package package1;

import java.util.HashSet;

public class LongestSubstringWithoutRepeating 
{
    public int lengthOfLongestSubstring(String s) 
    {
        int maxLength = 0;
        int left = 0;
        HashSet<Character> seen = new HashSet<>();

        for (int right = 0; right < s.length(); right++) 
        {
            char currentChar = s.charAt(right);

            // Shrink the window until the duplicate is removed
            while (seen.contains(currentChar))
            {
                seen.remove(s.charAt(left));
                left++;
            }

            seen.add(currentChar);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    // Sample test cases
    public static void main(String[] args) 
    {
        LongestSubstringWithoutRepeating solver = new LongestSubstringWithoutRepeating();

        System.out.println(solver.lengthOfLongestSubstring("abcabcbb")); // Output: 3
        System.out.println(solver.lengthOfLongestSubstring("bbbbb"));    // Output: 1
        System.out.println(solver.lengthOfLongestSubstring("pwwkew"));   // Output: 3
    }
}