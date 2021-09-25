class Solution {
    public int removeStones(int[][] stones) {
        Set<int[]> visited = new HashSet();
        
        int num=0;
        for (int s[]:stones){
            if(!visited.contains(s)){
                dfs(stones,s,visited);
                num++;
            }
        }
        return stones.length - num;
        
    }
    void dfs(int[][] stones,int[]s,Set<int[]> visited){
        visited.add(s);
        for (int []st : stones){
            if(!visited.contains(st)){
                if(s[0]==st[0] || s[1]==st[1])
                    dfs(stones,st,visited);
            }
        }
    }
}