import java.util.*;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums); // Sort array in ascending order
        int i = nums.length - 1; // Start from the last (largest) index

        while (k > 1) { // Move back (k-1) times
            i--;
            k--;
        }

        return nums[i]; // i now points to the k-th largest element
    }
}
