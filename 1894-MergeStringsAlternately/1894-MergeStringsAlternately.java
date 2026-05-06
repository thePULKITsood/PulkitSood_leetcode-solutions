// Last updated: 5/6/2026, 4:09:26 PM
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int max = Math.max(n, m);
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (i < max) {
            if (i < n) {
                sb.append(word1.charAt(i));
            }
            if (i < m) {
                sb.append(word2.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }
}