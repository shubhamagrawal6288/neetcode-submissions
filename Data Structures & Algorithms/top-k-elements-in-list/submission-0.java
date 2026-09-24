class Solution {
    public int[] topKFrequent(int[] nums, int k) {

    Map<Integer, Integer> mp = new HashMap<>();
    int[] ans = new int[k];

    for (int n : nums){
        mp.put(n, mp.getOrDefault(n, 0) + 1);
    }

    PriorityQueue<Map.Entry<Integer, Integer>> pq =
    new PriorityQueue<>(
        (a, b) -> b.getValue() - a.getValue()
    );

    for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
        pq.add(entry);
    }

    for(int i = 0; i < k; i ++) {
        Map.Entry<Integer, Integer> entry = pq.poll();
        ans[i] = entry.getKey();
    }

    return ans;


    }
}
