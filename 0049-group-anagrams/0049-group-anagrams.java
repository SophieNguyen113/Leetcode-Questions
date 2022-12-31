class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> hash = new HashMap<>();
        for(String s: strs){
            char[] letter = new char[26];
            for(char c: s.toCharArray()) letter[c-'a']++;
            String keyString = String.valueOf(letter);
            if(!hash.containsKey(keyString)) hash.put(keyString, new ArrayList<>());
            hash.get(keyString).add(s);
        }
        return new ArrayList<>(hash.values());
    }
}