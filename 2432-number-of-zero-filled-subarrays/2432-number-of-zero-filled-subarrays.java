//Approach - 2 (Simple Observation)
//T C : O(n) -> visite element only once 
//S C : O(1)
class Solution {
    
    public long zeroFilledSubarray(int[] nums) {

       int n = nums.length;

       long result = 0;

       long ZeroCount = 0;
 
     for(int i=0; i<n; i++){

           if(nums[i] == 0){

                ZeroCount++;
           }else{

                  ZeroCount = 0;
           }

           result = result+ZeroCount;
    }

     return result;
   
    }
}