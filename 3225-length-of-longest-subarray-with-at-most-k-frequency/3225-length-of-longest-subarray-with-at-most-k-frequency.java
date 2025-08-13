//Approach-1 (With Nested Loop - Classic Sliding Window Template)
//T.C : O(n)
//S.C : O(n)
class Solution {
    
    public int maxSubarrayLength(int[] nums, int k) {

      // Get the total number of elements in the array
int n = nums.length;

// Map to store the frequency of each element currently in the sliding window
Map<Integer, Integer> map = new HashMap<>();

// i -> start pointer of the window
// j -> end pointer of the window
// result -> stores the maximum valid window length found so far
int i = 0, j = 0, result = 0;

// Iterate until the end pointer reaches the end of the array
while (j < n) {

    // Add the current element nums[j] to the map (increase its frequency)
    // If it doesn't exist in the map, default frequency is 0 before adding
    map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);

    // While the frequency of the current element exceeds the allowed limit k,
    // shrink the window from the left by moving the start pointer i
    while (i <= j && map.get(nums[j]) > k) {
        
        // Decrease the frequency count of the element at nums[i]
        map.put(nums[i], map.get(nums[i]) - 1);

        // If frequency becomes zero, remove the element from the map entirely
        if (map.get(nums[i]) == 0) {
            map.remove(nums[i]);
        }

        // Move the start pointer forward (shrinking the window)
        i++;
    }

    // Update the maximum length of the valid window found so far
    result = Math.max(result, j - i + 1);

    // Move the end pointer forward to expand the window
    j++;
}

// Return the length of the longest valid subarray/window
return result;

    }
} 