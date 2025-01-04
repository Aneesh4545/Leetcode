import java.util.*;

class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();

        // Arrays to store first and last occurrences of each character
        int[] first = new int[26];
        int[] last = new int[26];
        Arrays.fill(first, -1);
        Arrays.fill(last, -1);

        // Populate first and last occurrences
        for (int i = 0; i < n; i++) {
            int ch = s.charAt(i) - 'a';
            if (first[ch] == -1) {
                first[ch] = i; // Store the first occurrence
            }
            last[ch] = i; // Update the last occurrence
        }

        // Count unique palindromic subsequences
        int count = 0;

        for (int ch = 0; ch < 26; ch++) {
            if (first[ch] != -1 && last[ch] != -1 && first[ch] < last[ch]) {
                // Use a HashSet to track unique middle characters
                Set<Character> uniqueMiddles = new HashSet<>();

                // Check characters between first[ch] and last[ch]
                for (int i = first[ch] + 1; i < last[ch]; i++) {
                    uniqueMiddles.add(s.charAt(i));
                }

                // Add the count of unique middle characters
                count += uniqueMiddles.size();
            }
        }

        return count;
    }
}
