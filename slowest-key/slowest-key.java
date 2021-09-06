class Solution {
    public char slowestKey(int[] T, String s) {
        int arr [] = new int [26];
        int n=T.length;
        
        for (int i =0;i<n;i++){
            
            int index = s.charAt(i)-'a';
            if(i==0)
            arr[index]= T[i];
            
            else{
                int time = T[i]-T[i-1];
                if(time>arr[index])
                    arr[index]=time;
            }
         }
        for (int i :arr)
        System.out.println(i);
        int max = 0;
        for (int i : arr)
            max=Math.max(i,max);
        
        for (int i=25;i>=0;i--){
            if(arr[i]==max)
                return (char)('a' + i);
        }
        return 'a';
        
    }
}