class Solution {
    public int[] getModifiedArray(int length, int[][] updates) {
        int ans []= new int [length+1];
        
        for (int [] update : updates){
            ans[update[0]] += update[2];
            
            ans[update[1]+1] -= update[2];
        }
        int runningSum =0;
        
        for (int i=0;i<=length;i++){
            runningSum+= ans[i];
            ans[i]=runningSum;
        }
        int newans []=new int [length];
        
        
        for (int i=0;i<length;i++){
            
            newans[i]=ans[i];
        }
        return newans;
    }
}