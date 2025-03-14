import java.util.*;

class Solution {
    public int maxVowels(String s, int k) {
        if (s.length() == 0) {
            return 0;
        }
        return maxv(s, k);
    }

    public static int maxv(String s, int k) {
        int left = 0;
        int right = 0;
        int ccount = 0;  // Current window vowel count
        int rcount = 0;  // Maximum vowels found in any window

        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        // Process the first window of size k
        for (right = 0; right < k; right++) {
            if (set.contains(s.charAt(right))) {
                ccount++;
            }
        }
        rcount = ccount;

        // Process the remaining characters using the sliding window
        while (right < s.length()) {
            // Add new character entering the window
            if (set.contains(s.charAt(right))) {
                ccount++;
            }
            // Remove old character leaving the window
            if (set.contains(s.charAt(left))) {
                ccount--;
            }

            // Update maximum vowel count
            rcount = Math.max(rcount, ccount);

            // Slide the window
            left++;
            right++;
        }
        return rcount;
    }
}