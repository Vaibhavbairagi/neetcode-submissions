class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();
        for(String str: strs) {
            char[] count = new char[26];
            for(int i = 0;i<str.length();i++) {
                count[str.charAt(i) - 'a']++;
            }
            String anagramHash = new String(count);
            anagramMap.putIfAbsent(anagramHash, new ArrayList<>());
            anagramMap.get(anagramHash).add(str);
        }
        return new ArrayList<>(anagramMap.values());
    }
}
