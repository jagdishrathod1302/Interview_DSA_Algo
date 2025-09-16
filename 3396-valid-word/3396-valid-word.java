//Approach (simple traverse and check)
//T.C : O(n)
//S.C : O(1)

/*
Step 1 : Understand Question we have to find valid word like 
        1.It contain a minimum of 3 character 
        2.It contain digit (0-9) English latter 
        3.it include at least Vowel
        4.It include at least one Consonant -> menas English latter not include Vowel

 */
class Solution {
    public boolean isValid(String word) {

        if(word.length() < 3){
            return false;
        }

        boolean hasVowel = false;
        boolean hasConsonant = false;

        for(char ch : word.toCharArray()){

         ch = Character.toLowerCase(ch);

         if(Character.isLetter(ch)){
              if(ch == 'a' || ch == 'i' || ch =='o' || ch == 'u' || ch =='e'){
                    hasVowel = true;                   
              }
              else {
                   hasConsonant = true;
              }
         }else if(!Character.isDigit(ch)){

               return false;
         }
    }
      return hasVowel && hasConsonant;    
    }
}