//Approach : Classic Sliding Window 
// T C : O(n)
// S C : O(1)
/*
Step 1: First Lets undestand Example nums = [1,3,2,3,3], k = 2 
        The subarrays that contain the element 3 at least 2 times are: [1,3,2,3], 
        [1,3,2,3,3], [3,2,3], [3,2,3,3], [2,3,3] and [3,3].

Step 1 First Find MaxElement in Array 
Step 2 : Apply Classic Sliding Window Approach 
       : How many Max elment inside window calculate
       : if countMax >= k then we get window at least contain 2 MaxElement 
        add into result 
        if nums[i] == maxElement then increase i++ and reduce maxCount
Step 3: return result
 */
class Solution {
    public long countSubarrays(int[] nums, int k) {

      int n = nums.length;
    
    //Max Element find 
     int maxE = Arrays.stream(nums).max().getAsInt();

      long result = 0;
      int maxCount = 0;

      int j = 0, i =0;

      while(j < n){

        // How many Max elment inside window calculate
         if(nums[j] == maxE){
            maxCount++;
         }

       
         while(maxCount >= k){

            result += (n-j);

            if(nums[i] == maxE){
                maxCount--;
            }
            i++;
         }
         j++;
 
      }

     return result;

    }
}