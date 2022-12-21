class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] hash = new int[26];
        int l = 0, r = 0;//[l,r) is window
        List<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < p.length(); i++) {
            hash[p.charAt(i) - 'a']++;
        }
        while (r < s.length()){
            //if-else guarantee the character in window must be useful.
            if (hash[s.charAt(r) - 'a'] > 0){
                //expand window
                hash[s.charAt(r) - 'a']--;
                r++;
            }
            else{
                //shrunk window
                hash[s.charAt(l) - 'a']++;
                l++;
            } 
            if (r-l == p.length()){
                res.add(l);
            }
        }
        return res;
    }
}