class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();

        // HashMap<Character, Integer> originalMap = new HashMap<>();
        // HashMap<Character, Integer> duplicateMap = new HashMap<>();

        // for(int i=0; i<n1;i++){
        //     char ch = s1.charAt(i);
        //     originalMap.put(ch,originalMap.getOrDefault(ch,0)+1);
        //     duplicateMap.put(ch,duplicateMap.getOrDefault(ch,0)+1);
        // }
        
        if(n1>n2){
            return false;
        }
        // for(int i=0;i<n2;i++){
        //     char current1 = s2.charAt(i);
        //     if(originalMap.containsKey(current1)){
        //         originalMap.put(current1, originalMap.get(current1)-1);
        //         int j = i+1;
        //         while(j<n2){
        //             char current2 = s2.charAt(j);
        //             if(!originalMap.containsKey(current2)){
        //                 break;
        //             } else{
        //                 originalMap.put(current2,originalMap.get(current2)-1);
        //             }

        //             if(originalMap.values().stream().allMatch(v -> v == 0)){
        //                 return true;
        //             }
        //             j++;
        //         }
        //     } else{
        //         originalMap.clear();
        //         originalMap.putAll(duplicateMap);
        //     }
        // }
        // return false;

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for(int i = 0;i < n1; i++){
            count1[s1.charAt(i) - 'a']++;
            count2[s2.charAt(i) - 'a']++;
        }
        if(Arrays.equals(count1, count2)){
            return true;
        }

        for(int i=n1;i<n2;i++){
            count2[s2.charAt(i)-'a']++;
            count2[s2.charAt(i-n1)-'a']--;

            if(Arrays.equals(count1,count2)){
                return true;
            }
        }
        return false;
    }
}