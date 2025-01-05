class Solution {
    public String findSmallestRegion(List<List<String>> regions, String region1, String region2) {
        // basically lowest comman ancestor but with a twist here we will do it by finding the path 
        // and to find the path we we=ill find it in reverse order thus we will store hashmap of child to parent so that i can reach the parent from the hash map
        
        HashMap<String,String> childtoparent= new HashMap();
        
        // 1. Get the map of child-parent, Key = child, Value = parent
        
        for (List<String> list:regions){
            String parent = list.get(0);
            for (int  i = 1; i < list.size() ; i++){
                childtoparent.put(list.get(i) , parent);
            }
        }
        //2. We have to keep adding region1, its parent, grandparent, etc. in a set till it doesn't become null
        Set<String> set = new HashSet<>();
        
        while(region1 != null) {
            set.add(region1);
            region1 = childtoparent.get(region1);
        }
        
        // 3. Now keep checking for region2 or its parents/ancestors in a set
        
        while(region2 != null) {
            // 4. Wherever we find a match, that is our answer!
            if(set.contains(region2)) {
                return region2;
            }
            region2 = childtoparent.get(region2);
        }
        return null;
    }
}