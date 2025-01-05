class Solution {
    public int leastInterval(char[] tasks, int n) {
        
        int arr[] = new int [26];
        
        for (char c : tasks){
            arr[c-'A']++;
        }
        
        Arrays.sort(arr);
        
        int max = arr[25]-1 ;
        
        int slots = max * n;
        
        for (int i = 24 ; i>=0 ; i--){
            slots -= Math.min(arr[i],max);
        }
        return slots>0 ? tasks.length+slots : tasks.length;
        
    }
}