class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap <Character, Integer> impact = new HashMap();
        int i = 0;
//      1. filling of the impact of characters    
        for (char ch: s.toCharArray()){
            impact.put(ch,i++);
        }
        int prev = -1 ;
        int max = 0;
        ArrayList<Integer> ans = new ArrayList();
        
        for ( i = 0 ; i< s.length();i++){
            
             max = Math.max(impact.get(s.charAt(i)) , max);
            if (i==max){
                ans.add(max-prev);
                prev=max;
                max=0;
            }
        }
        return ans;
    }
}