class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int arr[] = new int [26];
        int l = p.length();
        int n = s.length();
        
        int sim [] = new int [26];
        
        for (char c : p.toCharArray())
        sim[c-'a']++;    
        
        ArrayList<Integer> ans = new ArrayList();
        
        for (int i = 0; i <n ; i++  ){
            char ch = s.charAt(i);
            arr[ch-'a']++;
            
            if(i>= l-1){
                
//                 check siimlarity 
                
                if(similar(arr,sim)){
                    ans.add(i-l+1);
                }
//                 remove
                arr[s.charAt(i-l + 1) - 'a']--;
                
            }
            
        }
        return ans;
        
    }
    boolean similar(int[]arr,int[]sim){
        for (int i=0;i<26 ; i ++){
            if(arr[i]!=sim[i])
                return false;
        }
        return true;
    }
}