class Solution {
    private final String[] t = {"", "Thousand", "Million", "Billion"};
     Map<Integer,String> map;
    public String numberToWords(int num) {
            if (num == 0) return "Zero";
        
        map = new HashMap();
        map.put(1,"One");    
      map.put(2, "Two");
      map.put(3, "Three");
      map.put(4, "Four");
      map.put(5, "Five");
      map.put(6, "Six");
      map.put(7, "Seven");
      map.put(8, "Eight");
      map.put(9, "Nine");
              
        map.put(10,"Ten");
      map.put(11, "Eleven");
      map.put(12, "Twelve");
      map.put(13, "Thirteen");
      map.put(14, "Fourteen");
      map.put(15, "Fifteen");
      map.put(16, "Sixteen");
      map.put(17, "Seventeen");
      map.put(18, "Eighteen");
      map.put(19, "Nineteen");
              
       map.put(20,"Twenty");
       map.put(30,"Thirty");
       map.put(40,"Forty");
       map.put(50,"Fifty");
       map.put(60,"Sixty");
       map.put(70,"Seventy");
       map.put(80,"Eighty");
       map.put(90,"Ninety");
        
    
    String words="";
    int i = 0 ; 
    
    while (num>0)
    {
        int todo = num%1000;
    
        if(todo!=0){
            words = helper(todo) + t[i] +" " +words;
        }
        i++;
        num=num/1000;
        
    }
    return words.trim();
              
    }
    String helper (int num)
    {
        if (num==0)
            return "";
        
        else if (num<20)
            return map.get(num) +" ";
        
        else if (num<100)
            return map.get(num/10 * 10 ) +" " + helper (num%10);
        
        else 
            return map.get(num/100) + " Hundred " + helper(num % 100);
    }
}










