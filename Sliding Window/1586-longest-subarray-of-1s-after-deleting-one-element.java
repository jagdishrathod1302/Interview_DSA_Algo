//Aproach : Using Sliding Window 
// T C : O(n)
// S C:  O(1)

/*
 Step 1: first intialize sliding Window pointer
        one ZeroCount variable another is result 
        we need to delete 1 element so window is (j-i+1)-1 deleted Element (j-i) this is window 
Step 2 :If we see a zero, increment zero count
        If more than one zero, shrink the window from the left
         And Decrese Zero Counter ZeroCounter--;
         shrink i pointer i++;
Step 3  :Update result: we must delete one element, so window size is (j - i)

Step 4 : Edge Case nums = {1,1,1} delete 1 o/p {1,1} =2 If ZeroCount == 0 then return n-1;
         for Edge case (eg.1,0,0,0) output =1 
         return countOne == 1 ? countOne : result;

 */

class Solution {

    public int longestSubarray(int[] nums) {

     int zeroCount = 0;
        int longestWindow = 0;
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            // Increase zero count if current element is zero
            if (nums[j] == 0) {
                zeroCount++;
            }

            // Shrink the window if more than one zero
            while (zeroCount > 1) {
                if (nums[i] == 0) {
                    zeroCount--;
                }
                i++;
            }

            // Update the longest valid window size (we must delete one element)
            longestWindow = Math.max(longestWindow, j - i);
        }

        return longestWindow;
        
    }
}