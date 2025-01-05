class Solution {
    public boolean isOneEditDistance(String s, String t) {
        
        int l1 = s.length();
        int l2 = t.length();
        
        if (Math.abs(l1 - l2) > 1) {
            // more than 1 edit distance apart
            return false;
        }
        
        int i = 0;
        int j = 0;
        
        while (i < l1 && j < l2 && s.charAt(i) == t.charAt(j)) {
            i++;
            j++;
        }
        
        if (i == l1 && j == l2) {
            return false;
        }
        
        if (l1 > l2) {
            // deletion is only possible
            return s.substring(i + 1).equals(t.substring(j));
        } else if (l1 < l2) {
            // insertion is only possible
            return s.substring(i).equals(t.substring(j + 1));
        } else {
            // replacing is only possible
            return s.substring(i + 1).equals(t.substring(j + 1));
        }
    }
}