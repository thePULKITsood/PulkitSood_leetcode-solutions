class Solution {
    public String shiftingLetters(String s, int[] shift) {
        int n =s.length();
        shift[n-1]%=26;
        for (int i=n-2;i>=0;i--){
            shift[i]%=26;
            shift[i]=shift[i]+shift[i+1];
            shift[i]%=26;
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<n;i++){
            int c= s.charAt(i)-'a';
            c +=shift[i];
            c%=26;
            char ch = (char)('a'+c);

            sb.append(ch);        }
        return sb.toString();
        
    }
}