import java.util.*;

class Solution 
{
    public int findKthLargest(int[] nums, int k) 
    {
        

      //  Priorityqueue  pr = new Priortityqueue<>();
      PriorityQueue<Integer> pr = new PriorityQueue<>();

        for(int i=0;i<nums.length;i++)
        {
            if(pr.size()<k)
            {
                pr.add(nums[i]);
            }
            else if (nums[i]>pr.peek())
           {
                pr.poll(); // removing the top element form  the heap  if new element is grater then the top element 
                pr.add(nums[i]);  // then we add the new element 

            }
        }
        return pr.peek();
    }
}
