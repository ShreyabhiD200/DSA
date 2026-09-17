class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // for(int i=0;i<numbers.length;i++){
        //     for(int j=0;j<numbers.length;j++){
        //         if(i==j){
        //             continue;
        //         }
        //         int num1 = numbers[i];
        //         int num2 = numbers[j];
        //         if((num1 + num2) == target){
        //             return new int[]{i+1,j+1};
        //         }
        //     }
        // }
        // return new int[]{};

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int num1 = numbers[i];
            int num2 = target - numbers[i];
            if(map.containsKey(num2)){
                return new int[]{map.get(num2)+1, i+1};
            }
            map.put(numbers[i], i);
        }
        return new int[]{};
    }
}