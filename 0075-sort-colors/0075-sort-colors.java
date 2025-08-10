//Approach : Using Counting
// T C : O(n+n)
// S C : O(1)
class Solution { 
    public void sortColors(int[] nums) {
        
         int n = nums.length;

         int count_0 = 0;
         int count_1 = 0;
         int count_2 = 0;

         for (int i=0; i<n; i++){ //T C = O(n)

             if(nums[i] == 0){
                 count_0++;
             }else if(nums[i] == 1){
                 count_1++;
             }else {
                 count_2++;
             }
         }

        for (int i = 0; i <n; i++) { //T C = O(n)

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
}
