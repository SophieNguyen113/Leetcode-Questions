class Solution {
    public int characterReplacement(String s, int k) {
        int i=0;
        int maxFreq = 0;
        int ans = 0;
        int [] count_char = new int [26];
        for(int j=0; j < s.length(); j++){
            count_char[s.charAt(j) - 'A']++;
            maxFreq = Math.max(maxFreq, count_char[s.charAt(j) - 'A']);
            //windowsize - maxFreq is the time that we need to change the character
            if(j - i + 1 - maxFreq > k){
                count_char[s.charAt(i)-'A']--;
                i++;
            }
            ans = Math.max(ans, j - i + 1);
        }
        return ans;
    }
}