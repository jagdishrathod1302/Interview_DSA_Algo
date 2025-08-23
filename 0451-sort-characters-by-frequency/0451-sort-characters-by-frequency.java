//Approach-1 (Using Simple Array of pair and sorting it -  O(nlogn)
/*
Step 1 : Lets Understand example s = "tree" , output = 'eert' sort by frequecy 

 */
class Solution {
    
    public String frequencySort(String s) {

     //Step 1: count frequency of each character 
     Map<Character,Integer> freq = new HashMap<>();
     for(char ch : s.toCharArray()){

          freq.put(ch,freq.getOrDefault(ch,0)+1);
     }

     //Step 2: Store the pair<char,freq> pairs
     List<Map.Entry<Character,Integer>> list = new ArrayList<>(freq.entrySet());

     //Step 3: Sort by freq descending comparator
     list.sort((a,b)->b.getValue()-a.getValue());

     //Step 4 : Build Result 
     StringBuilder result = new StringBuilder();
     for(Map.Entry<Character,Integer> entry : list){
 
        char ch = entry.getKey();
        int value = entry.getValue();

        for(int i=0; i<value; i++){
            result.append(ch);
        }
     }

      return result.toString();
    }
}