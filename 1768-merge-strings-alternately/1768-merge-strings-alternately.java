class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] ch1 = word1.toCharArray();
        char[] ch2 = word2.toCharArray();
        int n = ch1.length + ch2.length;
        char[] merged_ch = new char[n];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<ch1.length || j<ch2.length){
            if(i < ch1.length){
                merged_ch[k] = ch1[i];
                i++;
                k++;
            }
            if(j < ch2.length){
                merged_ch[k] = ch2[j];
                j++;
                k++;
            }
        }
        String merged_st = String.valueOf(merged_ch);
        return merged_st;
    }
}