class Solution {
    public int trap(int[] height) {
        int sum = 0;
        int min = 0;
        int leftMax = Integer.MIN_VALUE;
        for(int i = 0;i < height.length; i++){
            leftMax = Math.max(leftMax, height[i]);
            if(i==0 || i==height.length-1){
                continue;
            }
            int rightMax = Integer.MIN_VALUE;
            for(int k = i+1; k < height.length; k++){
                rightMax = Math.max(rightMax, height[k]);
            }
            min = Math.min(leftMax, rightMax) - height[i];
            if(min > 0){
                sum += min;
            }
        }
        return sum;
    }
}