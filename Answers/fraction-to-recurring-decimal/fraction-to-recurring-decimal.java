class Solution {
    public String fractionToDecimal(int n, int d) {
        if(n==0)
            return "0";
        StringBuilder ans = new StringBuilder();
        
        if(n<0 ^ d<0) ans.append("-");
        //either one of them is less not both thats why we use XOR 
        
        long num = Math.abs((long)n);
        long den = Math.abs((long)d);
        
        // integer part 
        ans.append(num/den);
        long rem =num%den;
        if(rem == 0)
            return ans.toString();
        
        ans.append(".");
        Map<Long , Integer> map = new HashMap();
        
        while (rem !=0){
            if(map.containsKey(rem)){
                int index  = map.get(rem);
                ans.insert(index,"(");
                ans.append(")");
                break;
                
            }
            map.put(rem,ans.length());
            rem*=10;
            ans.append(rem/den);
            rem%=den;
            
        }
        return ans.toString();
        
    }
}


    