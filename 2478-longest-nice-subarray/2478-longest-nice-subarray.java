import java.util.*;

class Solution 
{
    public int longestNiceSubarray(int[] nums) 
    {
        int num=0;
        int j=0;
         int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            while((num&nums[i])!=0)
            {
                num^=nums[j++];
            }
           num|=nums[i];
           ans=Math.max(ans,i-j+1);
        }
        return ans;
    }
}