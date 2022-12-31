class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String s: strs){
            char[] charMap = new char[26];
            for(char c: s.toCharArray()) charMap[c-'a']++;
            String keyString = String.valueOf(charMap);
            if(!map.containsKey(keyString)) map.put(keyString, new ArrayList<>());
            map.get(keyString).add(s);
        }
        return new ArrayList<>(map.values());
    }
}