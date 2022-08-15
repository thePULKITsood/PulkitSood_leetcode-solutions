class Solution {
    public int romanToInt(String s) {
        
        Map<Character,Integer> map = new HashMap();
        
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        int len = s.length();
        int sum=0;
        int i=0;
        while (i<len){
            if(len-i>=2 && map.get(s.charAt(i)) < map.get(s.charAt(i+1)))
            {
                sum+=map.get(s.charAt(i+1))-map.get(s.charAt(i));
                i+=2;
            }
            else{
                sum+=map.get(s.charAt(i));
                i+=1;
            }
        }
        return sum;
    }
}

