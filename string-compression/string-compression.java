class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int i = 0;
        int j =0;
        int ans=0;
        
        while (i<n){
            j=i;
            
            while (j<n && chars[i]==chars[j])
                j++;
            
            chars[ans++]=chars[i];
            
            if(j-i > 1 ){
                String count = j-i +"";
                for (char c : count.toCharArray())
                    chars[ans++]=c;
            }
            i=j;
        }
        return ans;
    }
}