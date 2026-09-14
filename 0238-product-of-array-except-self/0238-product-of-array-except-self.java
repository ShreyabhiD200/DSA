class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int[] arr = new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     arr[i] = 1;
        // }
        // int slow = 0;
        // int fast = 1;
        // while(slow<nums.length){
        //     if(fast >= nums.length){
        //         fast=0;
        //         slow++;
        //         if(slow>=nums.length){
        //             break;
        //         }
        //     }
        //     if(slow==fast){
        //         fast++;
        //         continue;
        //     } else{
        //         arr[slow] *= nums[fast];
        //     }
        //     fast++;
        // }
        // return arr;

        int n = nums.length;
        int[] answer = new int[n];

        answer[0] = 1;
        //left product
        for(int i=1;i<n;i++){
            answer[i] = nums[i-1] * answer[i-1];
        }
        int right = 1;
        for(int i=n-1;i>=0;i--){
            answer[i] *= right;
            right *= nums[i];
        }
        return answer;
    }
}