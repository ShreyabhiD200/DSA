class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()){
            return "";
        } else if(t.length() == 0){
            return "";
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<t.length();i++){
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i),0)+1);
        }
        int j = 0;
        int i = 0;
        int count = map.size();
        int min = Integer.MAX_VALUE;
        int start = 0;
        while(j<s.length()){
            char current = s.charAt(j);
            if(map.containsKey(current)){
                map.put(current, map.get(current)-1);
                if(map.get(current) == 0){
                    count = count - 1;
                    if(count == 0){
                        if(j-i+1 < min){
                            min = j-i+1;
                            start = i;
                        }
                    }
                }
            }
            if(count == 0){
                while(count == 0){
                    char curr = s.charAt(i);
                    if(map.containsKey(curr) && map.get(curr)<0){
                        if(j-i+1 < min){
                        min = j-i+1;
                        start = i;
                    }
                        map.put(curr,map.get(curr)+1);
                        i++;
                    } else if(!map.containsKey(curr)){
                        if(j-i+1 < min){
                        min = j-i+1;
                        start = i;
                    }
                        i++;
                    } else if(map.containsKey(curr) && map.get(curr)==0){
                       if(j-i+1 < min){
                            min = j-i+1;
                            start = i;
                        }
                        count = count + 1;
                        i++;
                        map.put(curr, map.get(curr)+1);
                    }
                }
            }
            j++;
        }
        if(min==Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start, start+min);
    }
}