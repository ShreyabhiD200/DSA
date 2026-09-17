class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int area = 0;
        int i = 0;
        int j = height.length-1;
        while(i<j){
            min = Math.min(height[i],height[j]);
            area = min * (j-i);
            max = Math.max(max,area);
            if(height[i]<height[j]){
                i++;
            } else{
                j--;
            }
        }
        return max;
    }
}