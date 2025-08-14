//Approach : Sliding Window
// T C : O(n)
// S C : O(n) -> for map
class Solution { 
    public int maxSubarrayLength(int[] nums, int k) {


      Map<Integer,Integer> map = new HashMap<>();
       int n = nums.length;

       int i = 0, j = 0;

       int result = 0;
       int culprit = 0;

       while(j < n){

          //count each frequecy 
          map.put(nums[j],map.getOrDefault(nums[j],0)+1);

          //suppose map frequency > k means get culprit increment them ++
          if(map.get(nums[j]) == k+1){
                culprit++;
          }
         
          //if culprint =1 then we decrease frequecny of map map.get(nums[i])-1
          if(culprit > 0){

             map.put(nums[i],map.get(nums[i])-1);
             //if map[nums[i]] == k contain k value then decrease culprint--
             if(map.get(nums[i])==k){
                culprit--;
             }
             i++;
          }

          // if culprint == 0 then calculate result 
          if(culprit == 0){
              result = Math.max(result,j-i+1);

          }

          j++;
       }

       return result;  
    }
}