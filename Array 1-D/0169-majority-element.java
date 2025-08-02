//Approch : simple Iteration 
// T C : O(n)
// S C : O(1)

/*
 Step 1: First Asume the majority element nums[1] and count = 1
         Then we check Assum majority elment with current element 
         If equal meas Mejority Element found increase count ++
Step 2 : If mejority element and currentElement not equal reduce count--;
         And Suppose count == 0 then we get new majority Element like maj = nums[i] & count=1;
 */

class Solution {
    public int majorityElement(int[] nums) {

      int n = nums.length;

      int maj = 0;
      int count = 0;

      for(int i=0; i<n; i++){

       if(count == 0){
        count =1;
        maj = nums[i];
       }
       //majority element found 
       else if(maj == nums[i]){
          count++;
       }
       else{
            //majority element not found reduce count 
             count--;
         }

      }

      return maj;  
    }
}