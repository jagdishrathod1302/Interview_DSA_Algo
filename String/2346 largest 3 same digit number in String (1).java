//Approach :Simple iteration and check
// T C : O(n)
// S C : O(1)

/*

 Step 1: first Create  maxChar where store max value 
 Step 2 : loop start from 2 the check current number equal with previous num[i-1],num[i-2] means 3 number 
 Step 3 : the return if not get any 3 digit empty string " "
 Step 3: if present three digit string return 3 size String with 3 value new String(new char[]{maxChar,maxChar,maxChar}) 
 */
class Solution {
    public String largestGoodInteger(String num) {

     char maxChar = ' ';

     for(int i=2; i<num.length(); i++){

          if(num.charAt(i) == num.charAt(i-1) && num.charAt(i) == num.charAt(i-2)){
             maxChar = (char) Math.max(maxChar,num.charAt(i));
          }
     }
      return maxChar == ' '?"":new String(new char[]{maxChar,maxChar,maxChar});
        
    }
}
=======================================================================================================================================================================
 //Using Java 8 
 class Solution {
    public String largestGoodInteger(String num) {

      return IntStream.range(2,num.length())
        .filter(i->num.charAt(i) == num.charAt(i-1) && num.charAt(i) == num.charAt(i-2))
        .mapToObj(i->""+num.charAt(i)+num.charAt(i)+num.charAt(i))
        .max(String::compareTo)
        .orElse("");
        
    }
}
