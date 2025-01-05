class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        
        // ans will be from  n times 0 to n times 1
        // 0to 2n -1 
         boolean arr[] = new boolean [65537];
        
        for (String s : nums){
            int index = convert(s);
            // System.out.println(index);
            arr[index]=true;
        }
        for (int i =0;i<65537;i++){
            if(arr[i]==false)
            {
                String ans = convertBack(i,n);
                return ans;
            }
        }
        return "0";
        
    }
    int convert (String s){
        int ans =0;
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        for (int i =0;i<sb.length();i++){
            if(sb.charAt(i)=='1')
                ans += Math.pow(2,i);
        }
        return ans;
    }
    String convertBack(int i , int n){
       StringBuilder sb = new StringBuilder();
        int count = 0;
        while (i>=0 && count <n){
            sb.append(i%2);
            i=i/2;
            count ++;
        }
        sb.reverse();
        return sb.toString();
    }
}

/*
      1
7  1  2
3  1  3
1  1  4
0  0  4
0  0  5
01
10
11

111
011

100
001

101


00
01

01



*/