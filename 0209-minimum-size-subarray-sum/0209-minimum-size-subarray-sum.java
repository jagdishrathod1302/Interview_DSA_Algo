//Approach : (Using Sliding Window)
// T C : O(n)
// S C : O(1)
/*
  Step 1: first declare variable i,j,sum,minL start from n+1
           take sum of j pointer window 
  Step 2 : try to minimize window 
           1.start loop while sum >= target then 
           2. calculate minL
           3.then increase i pointer to minimize window 
           4.and subtract value from sum
  Step 3 : return minL == n + 1 ? 0 : minL; 
           1.because if the array of all elemnt not equal ro greater 
           2.than target so we return 0 otherwise we return minL
 */

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
         int n = nums.length;
         int i = 0;
         int j = 0;
         int sum =0;
         int minL = n+1;

         while(j < n){
 
           //sum of the window 
           sum += nums[j];

               //if get window try to minimize window to decrese i
               while(sum >= target){
 
                minL = Math.min(minL,j-i+1);

                 sum -= nums[i];
                 i++;
               }
            
            j++;

         }

      return minL == n + 1 ? 0 : minL;

    }
}