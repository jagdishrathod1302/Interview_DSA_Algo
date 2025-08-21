//Approach-1 (Time : O(nlogn), Space : O(n))
class Solution {
   
   public List<String> topKFrequent(String[] words, int k) {

  List<Map.Entry<String, Integer>> vp = new ArrayList<>();
        Map<String, Integer> mp = new HashMap<>();

        // Count frequencies
        for (String word : words) {
            mp.put(word, mp.getOrDefault(word, 0) + 1);
        }

        // Push into list (like vector<pair<int,string>>)
        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
            vp.add(entry);
        }

        // Custom comparator (same as C++ lambda)
        Comparator<Map.Entry<String, Integer>> lambda = (p1, p2) -> {
            if (p1.getValue().equals(p2.getValue())) {
                return p1.getKey().compareTo(p2.getKey()); // lexicographical order
            }
            return p2.getValue() - p1.getValue(); // higher frequency first
        };

        // Sort
        vp.sort(lambda);

        // Collect top k
        List<String> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(vp.get(i).getKey());
        }

        return result;
    }
}