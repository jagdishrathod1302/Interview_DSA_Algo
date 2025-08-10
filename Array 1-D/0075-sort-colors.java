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
===============================================================================================================
//Approach : Using Counting
// T C : O(n+n)
// S C : O(1)
    public static void sortColors(int[] nums) {

         int n = nums.length;

         int count_0 = 0;
         int count_1 = 0;
         int count_2 = 0;

         for (int i=0; i<n; i++){

             if(nums[i] == 0){
                 count_0++;
             }else if(nums[i] == 1){
                 count_1++;
             }else {
                 count_2++;
             }
         }
        for (int i = 0; i <n; i++) {

            if(count_0 > 0){
                nums[i] =  0;
                count_0--;
            } else if (count_1 > 0) {
                nums[i] = 1;
                count_1--;
            }else {
                nums[i] =2;
                count_2--;
            }
        }
    }





