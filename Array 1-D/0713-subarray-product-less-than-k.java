//Approach : Simple Sliding Window
// T C : O(n)
// S C : O(1)

/*
Step 1 : Lets Know about the Example nums = [10,5,2,6] , k = 100 Output : 8
         SubArray like that have product less than 100 are : 
         [10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
         Note that [10, 5, 2] is not included as the product of 100 we need  less than k

Step 2: First initilze Variable product = 1 , result = 0, for sliding window i =0,j=0

Step 3 : Iterate over the array 1 Find Product then 2. strat loop product >= k
         and 3. Shrink i pointer i++

Step 4 : then We count the SubArray present inside Array like that (j-i+1)

Step 5 : Hande Corner case suppose Example like this nums = [1,2,3], k = 0;
         then if(k < 1) return 0

 */

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
              int N = nums.length;
              int product = 1;
              int result = 0;
              int j = 0,i=0;

              //corner case 
              if(k <= 1){
                  return 0;
              }

              while (j < N){
                  product *= nums[j];
                 
                 // if subArray Sub > Than Product divide product/nums[i]
                  while ( product >= k){

                           product /= nums[i];
                          i++;

                  }
                  result += (j-i+1);// count subArray end with j pointer
                  j++;
              }
              return result;
    }
}