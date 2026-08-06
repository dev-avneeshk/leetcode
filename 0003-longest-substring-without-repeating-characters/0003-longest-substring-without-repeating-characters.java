
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0;
        int maxLen = 0;
        int index[] = new int[128];
        Arrays.fill(index, -1);

        for(int right =0; right<n; right++){
            char c = s.charAt(right);
            if (index[c]>= left){
                left = index[c]+1;
            } index[c] = right;
            maxLen = Math.max(maxLen, right-left+1);
        }

        return maxLen;

        
    }
}