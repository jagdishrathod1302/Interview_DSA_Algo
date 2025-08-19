//Approach : Using Map
// T C  : O(n)
// S C  : O(n)
class Solution {
    public boolean containsDuplicate(int[] nums) {

          int n = nums.length;

          Map<Integer,Integer> map = new HashMap<>();

          for(int num : nums){

                 map.put(num,map.getOrDefault(num,0)+1);
          }

          for(int i=0; i<n; i++){

                if(map.get(nums[i]) >= 2){

                    return true;
                }

          }

      return false;

    }
}
