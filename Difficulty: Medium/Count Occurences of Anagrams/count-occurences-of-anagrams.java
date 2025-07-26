// User function Template for Java

//T.C : O(n)
//S.C : O(1)
/*
Step 1 : First Identify this problem is solving Throeugh Sliding Window
         1.Apply Create one 26 Size Array count to Store with 0 value 
         2.the pat String character fill in the count array
         3.declare variable and  variable result 
Step 2 : Step three Finding Window in txt String 
          1.first reduce value from count array 0 
          2.then check window size 3 or not like this j-i+1
          3.then size is 3 check count array all element zero or not 
          4.found count array zero we increment result++
Step 3 : return result 


*/
class Solution {
    
    //function check zeros 
    private boolean allZero(int[] count) {
        for (int num : count) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }

    int search(String pat, String txt) {
        int k = pat.length();
        int[] count = new int[26];
        Arrays.fill(count, 0);
        
        //fill count 26 array 
        for (char ch : pat.toCharArray()) {
            count[ch - 'a']++;
        }

        int i = 0, j = 0;
        int n = txt.length();
        int result = 0;

        while (j < n) {
            int idx = txt.charAt(j) - 'a';
            count[idx]--;

            if (j - i + 1 == k) {
                if (allZero(count)) {
                    result++;
                }

                count[txt.charAt(i) - 'a']++;
                i++;
            }
            j++;
        }
        return result;
    }
}