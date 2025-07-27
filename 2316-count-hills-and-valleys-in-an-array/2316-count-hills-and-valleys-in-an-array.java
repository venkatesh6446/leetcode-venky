import java.util.*;
class Solution 
{
    public int countHillValley(int[] nums) 
    {
       List<Integer>obj=new ArrayList<>();
       obj.add(nums[0]);
       for(int i=1;i<nums.length;i++)
       {
          if(nums[i]!=nums[i-1])
          {
            obj.add(nums[i]);
          }
       }
    
    int count=0;
    for(int i=1;i<obj.size()-1;i++)
    {
        int prev= obj.get(i-1);
        int curr= obj.get(i);
        int next= obj.get(i+1);

        if( (curr>prev && curr>next)  || (curr<prev && curr<next) )
        {
            count++;
        }
    }
   return count;
    
    }

    
}