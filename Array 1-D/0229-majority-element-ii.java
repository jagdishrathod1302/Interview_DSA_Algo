// Approach -> using HashMap
// T C : 0(n)
// S C : 0(n) -> for HashMap

/*
  Step 1 : find frequency of each number and add Into Map
  
  Step 2 : Iterate over each key and value pair in the hashmap

  Step 3 : if count > n/3 then add the elment into to the result 

 */

class Solution {
   
    public List<Integer> majorityElement(int[] nums) {

        int n = nums.length;

        Map<Integer,Integer> freq = new HashMap<>();

        List<Integer> result = new ArrayList<>();

        //Step 1 :find frequency of each number
        for(int num : nums){

            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

         //step 2: Iterate over each key and value pair in the hashmap
        for(Map.Entry<Integer,Integer> entry : freq.entrySet() ){

             int element = entry.getKey();
             int count =   entry.getValue();

             //Step 3 : add the elment to the result if its frequency
             if(count > n/3){
                result.add(element);
             }
        }

       return result;
    }
}