class Solution {
    public int characterReplacement(String s, int k) {
        int left =0;
        int right = 0;
        int n = s.length();
        
        int count []= new int [26];
        int maxcount =0;
        
        int ans = 0;
        
        while (right <n){
           
            // expand the window 
            count[s.charAt(right)-'A']++;
            int cnt = count[s.charAt(right)-'A'];
            maxcount = Math.max(maxcount,cnt);
            
            
            right ++;
            
            //contract the window 
            while (right - left -maxcount > k){
                 count[s.charAt(left)-'A']--;
                 left++;
                
            }
            ans=Math.max(ans,right-left);
            
            
        }
        return ans;
    }
}
// k times - 
// basically i can allow k different letters in the window other than the letter with the maximum frequency 

// 1. have a hashmap and a max freq with a digit 

//now i encounter a digit is is the same as the max freq - inc the max freq 

// i encounter another digit different - increase its frequency and then check the max freq which one is bigger 

// then if size - max >k start removing the ones from the left 
