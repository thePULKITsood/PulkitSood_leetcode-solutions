class WordDistance {
    HashMap<String,ArrayList<Integer>> map;
    public WordDistance(String[] arr) {
        
        map = new HashMap();
        
        for (int i = 0 ; i <arr.length ; i++ ){
            
        if(map.get(arr[i])==null)
            map.put(arr[i],new ArrayList());
            
            map.get(arr[i]).add(i);
            
            }
        
    }
    
    public int shortest(String word1, String word2) {
        
        ArrayList<Integer> list1 = map.get(word1);
        ArrayList<Integer> list2= map.get(word2);
        
        int i = 0 ;
        int j=0;
        int min = Integer.MAX_VALUE;
        
        while (i<list1.size() && j<list2.size()){
        min=Math.min(min, Math.abs(list1.get(i) - list2.get(j) ));
        
        if(list1.get(i) < list2.get(j))
            i++;
        else 
            j++;
        }
        return min ;
    }
    
}

/**
 * Your WordDistance object will be instantiated and called as such:
 * WordDistance obj = new WordDistance(wordsDict);
 * int param_1 = obj.shortest(word1,word2);
 */