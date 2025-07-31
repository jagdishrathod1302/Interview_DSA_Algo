//Approach : Sliding Window
// T C : O(n)
// S C : O(1)
/*
Step 1 : first know the position of mink and maxk and cultpritidx 
Step 2 : Then calculate the samller mink_position - maxk_position - cultpritidx;
Step 3 : if counter -ve value not store in ans like counter > 0 ans += counter return ans 
 */
class Solution {

    public long countSubarrays(int[] nums, int minK, int maxK) {

      long ans = 0;

      int mink_position = -1;
      int maxk_position = -1;

      int cult_idx = -1;

      int n = nums.length;

     for(int i=0; i<n; i++){

         // find cult_idx in nums array 
         if(nums[i] < minK || nums[i] > maxK){
             
             cult_idx = i;
         }
         //store the index of mink

         if(nums[i] == minK){
            
            mink_position = i;
         }

         //store index of maxk
         if(nums[i] == maxK){
         
             maxk_position = i;
         }

        // calculate counter 
        int counter = Math.min(mink_position,maxk_position)-cult_idx;
        
        // only positive values store in ans 
        if(counter > 0){
            ans += counter;
        }
     }
      return ans;
    }
}