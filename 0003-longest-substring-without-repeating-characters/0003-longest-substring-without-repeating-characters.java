class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = Integer.MIN_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        if(s.length() == 0){
            return 0;
        }
        for(int i = 0; i<s.length();i++){
            char current = s.charAt(i);
            if(map.containsKey(current) && map.get(current) >= left){
                left = map.get(current) + 1;
            }
            map.put(current, i);
            maxLength = Math.max(maxLength, i-left+1);
        }
        return maxLength;
    }
}