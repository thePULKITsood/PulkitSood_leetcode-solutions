class Solution {
    public String convertToTitle(int cn) {
        StringBuilder sb = new StringBuilder ();
        
        while (cn>0)
        {
        
        
cn--;        
        sb.append((char)('A' + cn % 26));
        cn = cn/26;

        }
        return sb.reverse().toString();
    }
}