//Approach : Sliding Window 
// T C     : O(n)
// S C     : O(n) -> for unorder Set

/*
Step 1 : if Abs(i-j) > k then shrink Window remove i value from set and increse i++
Step 2 : if j value present in set means duplicate found in window return true 
Step   : Otherwise add j value in Set() and increse j pointer further check 
 */

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

       int n = nums.length;

       Set<Integer> set = new HashSet<>();

       int i = 0, j = 0;

       while(j < n){

          if(Math.abs(i-j) > k){ // opposite abs(i-j) <= k
            //Shrink Window Increse i Pointer
            set.remove(nums[i]);
            i++;
          }

          //check Previous window value contain or not 
          if(set.contains(nums[j])){
            return true;
          }
 
          set.add(nums[j]);
          j++;

       }

     return false;
    }
}
