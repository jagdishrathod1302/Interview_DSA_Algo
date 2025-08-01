//Approach : Sliding Window 
// T C : O(n)
// S C : O(1)

/*
Step 1 : window two variable i =0, j =0;
       : keep counting vowel in j pointer 
Step 2 : if window size equal k then  
    : you found window of k size 
    : and shift window reight side using i++;
    : and if maxV > count update maxV
    :  i pointer check ovwel or not if present reduce count--
    : return maxv
 */
class Solution {

     //This method check vowel 
     public boolean isVowel(char ch){

        return ch=='a' || ch == 'o' || ch == 'u' || ch == 'i' || ch == 'e';
     }

    public int maxVowels(String s, int k) {

       int n = s.length();
       int i = 0, j = 0;
       int count = 0;
       int maxV = 0;

       while(j < n){

         //if j pointer check vowel or not
         if(isVowel(s.charAt(j))){

             count++;
         }

         ////get window size check further window 
        if(j-i+1 == k){
        
          //update greater vowel count get 
          maxV = Math.max(maxV,count);

             //if i contain vowel reduce count
            if(isVowel(s.charAt(i))){
                 count--;
            }
            i++;
         }

         j++;
       }

      return maxV;  
    }
}