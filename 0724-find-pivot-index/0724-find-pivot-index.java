//Approch : Simple Iteration 
// T C : O(n)
// S C : O(1)
/*
Step 1: Lets Uderstand What is Example Pivot Index means the index lies between mid of Array

        Example nums = [1,7,3,6,5,6] pivote index is 3 
        output: is leftside{1+7+3}11 == rightside{5+6}11 sum
Step 2: First Calculate totalSum of Array then set cumulativeSum = 0 
Step 3: start for loop over the nums array and Left =cumulativeSum;
        and Right = totalSum - Left-nums[i];
        if(left == right) we get Pivote index return index
Step 3: Corner case : if only 1 element, it's left and right are equal :-)
        We can't have an equilibrium with only 2 elements :-(
 */
class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;

        // Special case: single element array
        // if (n == 1) {
        //     return 0; // index 0 is the pivot
        // }
        // // Special case: two elements can't have a pivot
        // if (n == 2) {
        //     return -1;
        // }

        // Calculate total sum
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        // Check pivot index
        int cumSum = 0;
        for (int i = 0; i < n; i++) {
            int left = cumSum;
            int right = totalSum - left - nums[i];

            if (left == right) {
                return i; // found pivot
            }
            cumSum += nums[i];
        }

        return -1; // no pivot found
    }
}