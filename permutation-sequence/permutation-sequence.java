class Solution {
    public String getPermutation(int n, int k) {
        
        // 4 
        //1234
        
        
        //k=9
        //1234
        //1243
        //1324
        //1342
        //1423
        //1432
        //2134
        //2143
        //2314
        
        // we can start from the behind and do a swapping operation on the string and keep dec k ans as we are at 0 return the ans
        int factorial [] = new int [n+1];
        List<Integer> numbers = new ArrayList();
        
        factorial[0]=1;
        
        for(int i = 1;i<n;i++){
            factorial[i]=i*factorial[i-1];
            numbers.add(i);
        }
        numbers.add(n);
        k--;
        
        StringBuilder sb = new StringBuilder();
        for (int i =1;i<=n;i++){
            int idx = k/factorial[n-i];
            sb.append(numbers.get(idx));
            
            numbers.remove(idx);
            k-= idx*factorial[n-i];
        }
        return sb.toString();
        
        
    }
}