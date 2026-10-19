class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) return 0;

        int low = 0;
        int result = 1; // FIX: First character is a valid window

        Set<Character> set = new HashSet<>();
        set.add(s.charAt(low));

        for (int high = 1; high < s.length(); high++) {

            while (set.contains(s.charAt(high))) {
                set.remove(s.charAt(low));
                low++;
            }

            set.add(s.charAt(high));

            result = Math.max(result, high - low + 1);
        }

        return result;
    }
}