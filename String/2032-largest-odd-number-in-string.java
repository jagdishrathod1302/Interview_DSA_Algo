// Approach : Greedy simple Back Iteration 
// T C : O(n)
// S C : O(1)

/*
Step 1: first Iterate from back check char number each character 
Step 2 :convert character into integer through method Characte.getNumericValue()
Step 3: then if found odd number return subString(0,i+1)
Step 4 : otherwise return "" empty string 
 */
class Solution {  
    public String largestOddNumber(String num) {

      int n = num.length();

      for(int i=n-1; i>=0; i--){

          if(Character.getNumericValue(num.charAt(i))%2 == 1){
            return num.substring(0,i+1);
          }
      }

     return "";
    }
}
