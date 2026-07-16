class Solution {
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;
        int n = s.length();
        char[] ch = s.toCharArray();
        while(left<right){
            if(isVowel(ch[left]) & isVowel(ch[right])){
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;

                left++;
                right--;
            } else if(isVowel(ch[left])){
                right--;
            } else{
                left++;
            }
        }
        String str = String.valueOf(ch);
        return str;
    }

    private boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' ||
            c == 'o' || c == 'u' ||
            c == 'A' || c == 'E' || c == 'I' ||
            c == 'O' || c == 'U'; 
    }
}