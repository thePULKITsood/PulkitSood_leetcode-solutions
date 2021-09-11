class Solution {
    public String largestNumber(int[] nums) {
        String arr[] = new String[nums.length];
        for (int i=0;i<nums.length;i++){
            arr[i]=nums[i]+"";
        }
        Arrays.sort(arr,(a,b)->{
            
            long l1 = Long.parseLong(a+b);
            long l2 = Long.parseLong(b+a);
            
            if(l1>l2)
                return -1;
            else if(l2>l1)
                return 1;
            else 
                return 0;
            
        });
            StringBuilder sb = new StringBuilder();
        
        for (int i =0 ; i <nums.length ; i++){
            sb.append(arr[i]);
        }
        
        if(sb.charAt(0)=='0')
            return "0";
        return sb.toString();
    }
}