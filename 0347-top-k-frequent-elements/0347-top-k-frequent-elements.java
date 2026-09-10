class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for(int num : nums){
            frequencyMap.put(num, frequencyMap.getOrDefault(num,0) + 1);
        }
        ArrayList<Integer>[] bucket = new ArrayList[nums.length+1];
        for(int num: frequencyMap.keySet()){
            int frequency = frequencyMap.get(num);
            if(bucket[frequency] == null){
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(num);
        }

        int[] result = new int[k];
        int index = 0;
        for(int frequency = bucket.length-1;frequency>=0;frequency--){
            if(bucket[frequency] != null){
                for(int num: bucket[frequency]){
                    result[index] = num;
                    index++;
                    if(index==k){
                        return result;
                    }
                }
            }
        }
        return result;
    }
}