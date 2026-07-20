class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap();
        for(String s : strs){
            int[] count = new int[26];
            for(char c : s.toCharArray()){
                count[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int nums : count){
                sb.append("#");
                sb.append(nums);
            }

            String key = sb.toString();
            map.computeIfAbsent(key, k-> new ArrayList<>());
            map.get(key).add(s);

        }
        return new ArrayList<>(map.values());

        
    }
}