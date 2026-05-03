class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int val : nums) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        PriorityQueue<Integer> pg = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

        for (int key : map.keySet()) {
            pg.add(key);

            if (pg.size() > k) {
                pg.poll();
            }
        }
        
        int i = 0;
        int[] result = new int[k];
        while (!pg.isEmpty()) {
            result[i++] = pg.poll();
        }

        return result;
    }
}
