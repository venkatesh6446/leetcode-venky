public class Solution {
    public long countSubarrays(int[] nums, long k) {
        int j = 0;
        long sum = 0, count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            
            // Shrink the window if score (sum * length) >= k
            while (sum * (i - j + 1) >= k) {
                sum -= nums[j];
                j++;
            }
            
            // Count all valid subarrays ending at i
            count += (i - j + 1);
        }
        
        return count;
    }
}