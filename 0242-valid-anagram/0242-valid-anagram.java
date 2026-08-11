class Solution {
    public boolean isAnagram(String s, String t) {
        
        HashMap<Character, Integer> map1 = new HashMap<>();
        int a = s.length();
        int b = t.length();

        if(a==b){
            for(int i=0;i<a;i++){
                char ch = s.charAt(i);
                map1.put(ch,map1.getOrDefault(ch,0)+1);
            }

            int n = b-1;
            for(int j=0;j<b;j++){
                char ch = t.charAt(j);
                if(!map1.containsKey(ch)){
                    return false;
                }
                map1.put(ch, map1.get(ch)-1);
                if(map1.get(ch)==0){
                    map1.remove(ch);
                }
            }
            return map1.isEmpty();
        }
        
        return false;

    }
}