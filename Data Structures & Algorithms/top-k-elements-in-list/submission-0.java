class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums == null || nums.length == 0 ||  k == 0) return new int[0];

        Map<Integer, Integer> freq = new HashMap<>();
         for(int num : nums){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
         }

         PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(freq.get(a) , freq.get(b)));

         for(int num : freq.keySet()){
            minHeap.add(num);

        while(minHeap.size()> k){
              minHeap.poll();
            }
         }
        
        int[] result = new int[k];

        for(int i = 0 ; i < k ; i++){
            result[i] = minHeap.poll();
        }

        return result;

    }
}
