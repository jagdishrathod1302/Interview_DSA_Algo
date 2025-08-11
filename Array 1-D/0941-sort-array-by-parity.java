// Approach : Swaping Sort
// T C : O(n)
// S C : O(1)
/*
Step 1: First i start for loop 
        if(nums[i]%2 == 0) is Even 
        then Doing Swaping 
 */
class Solution {

    public int[] sortArrayByParity(int[] nums) {

        int j = 0;
        int n = nums.length;

        for(int i =0; i<n; i++){
            
             if(nums[i]%2 == 0){

              int temp = nums[i];
              nums[i] = nums[j];
              nums[j] = temp;
              j++;

             }

        }
        return nums;


    }
}