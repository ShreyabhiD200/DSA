class Solution {
    public boolean isAnagram(String s, String t) {
        
        HashMap<Character, Integer> map1 = new HashMap<>();
        int a = s.length();
        int b = t.length();

        if(a==b){
            for(int i=0;i<a;i++){
                map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
            }

            int n = b-1;
            int last_index_of_j = 0;
            int last_index_of_t = b-1;
            for(int j=0;j<b;j++){
                if(map1.containsKey(t.charAt(j))){
                    map1.put(t.charAt(j), map1.get(t.charAt(j))-1);
                    if(map1.get(t.charAt(j))==0){
                        map1.remove(t.charAt(j));
                    }
                    last_index_of_j = j;
                }
            }
            if(map1.isEmpty() && (last_index_of_j==last_index_of_t)){
                return true;
            }
            return false;
        }
        
        return false;

    }
}