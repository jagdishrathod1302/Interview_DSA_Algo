//Approach - 2 (Simple Observation)
//T C : O(n) -> visite element only once 
//S C : O(1)

/*
Step 1 : Let know more about e.g nums = {1,3,0,0,2,0,0,4} Right we calcualte zero subArray count
         int this Example we have 6 subArray of Zero subArray Like this 0,0,00,= 3 , 0,0,00 =3 total 6

Step 2 : Now first we take length of Zero like as while(i<n && nums[i] == 0) lenZero++;

Step 3 : we calculate subArray using this formula result = (lenZero)*(lenZero+1)/2;

Step 4 : return result;
 */

class Solution {
    
    public long zeroFilledSubarray(int[] nums) {

      int i = 0;
      long result = 0;
      int n = nums.length;

      while(i < n){

           long lenZero = 0;

            //count length of Zero 
            while(i < n && nums[i]== 0){
                  lenZero++;
                  i++;                
            }

         //count subArray using this formula 
         result += (lenZero)*(lenZero+1)/2;
            i++;
      }

     return result;
    }
}