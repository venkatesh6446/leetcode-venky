import java.util.*;

class Solution {
    public String reverseWords(String s) {
        return rev(s);
    }

    public String rev(String s) {
        String str = s.trim();
        StringBuilder sb = new StringBuilder();

        int i = str.length() - 1;

        while (i >= 0) {
            // Skip any trailing spaces
            while (i >= 0 && str.charAt(i) == ' ') {
                i--;
            }

            if (i < 0) break;  // nothing more to process

            int end = i;

            // Find the start of the word
            while (i >= 0 && str.charAt(i) != ' ') {
                i--;
            }

            int start = i + 1;

            // Append the word
            sb.append(str.substring(start, end + 1)).append(" ");
        }

        // Remove trailing space and return
        return sb.toString().trim();
    }
}
