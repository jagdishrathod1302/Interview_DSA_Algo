// Approach-3 (Follow up) : O(n)
// T.C : O(n)
// S.C : O(1)
/*
Step 1 : first we have gieven only 3 colors like this red , white blue
         our Task is to sort the colour [0,1,2]
Step 2 : First Assum i = 0 , j =1, k=2 then i & j pointing 0th index
         and k pointing n-1; 
Step 3 : if nums[j] == 1 -> j++, is nums[j] == 0 i++ and swap , if nums[j] == 2 k--
         swap,
Step 4 Create One Swap Method for Swaping  

 */
class Solution {
    //for Swaping 
    public static void swap(int[] nums, int a, int b){

        int temp = nums[a];
        nums[a] = nums[b];
        nums[b]=temp;
    }
    

    public static void sortColors(int[] nums){

        int n = nums.length;

        int i = 0;   // pointer for 0
        int j = 0;   // pointer for 1
        int k = n - 1; // pointer for 2

        while (j <= k) { // should be <= so k is included
            if (nums[j] == 0) {
                swap(nums, i, j); // using swap method
                i++;
                j++;
            } else if (nums[j] == 2) {
                swap(nums, j, k); // using swap method
                k--;
            } else {
                j++;
            }

      }
    }
 
}