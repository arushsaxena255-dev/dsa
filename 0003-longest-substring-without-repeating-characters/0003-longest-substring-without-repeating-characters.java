class Solution {
    public int lengthOfLongestSubstring(String s) {

        int left = 0;
        int maxLength = 0;

        int[] freq = new int[128];

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);
            freq[ch]++;
            while (freq[ch] > 1) {
                freq[s.charAt(left)]--;
                left++;
            }
            int length = right - left + 1;

            maxLength = Math.max(maxLength, length);
        }
        return maxLength;
    }
}