class Solution {
    public String intToRoman(int num) {
        int thou = num/1000;
        int hund = (num % 1000) / 100;
        int ten = (num%100) / 10;
        int one = num%10;
        
//         now using 0ne five and 10 only 
        
        StringBuilder sb = new StringBuilder ();
      
        sb.append(func(thou, "M", "", ""));  
        sb.append(func(hund, "C", "D", "M")); 
        sb.append(func(ten, "X", "L", "C"));
        sb.append( func(one, "I", "V", "X"));
        
        return sb.toString();
    }
    String func ( int num ,String one, String five , String ten){
        StringBuilder sb = new StringBuilder();
        
        if(num==0) return sb.toString();
        
        if(num<=3){
            while(num-->0)
                sb.append(one);
        }
        else if (num==4)
        {
            sb.append(one);
            sb.append(five);
        }
        else if (num<=8){
            sb.append(five);
            
            num-=5;
            
            while(num-->0)
                sb.append(one);
        }
        else{
            sb.append(one);
            sb.append(ten);
            }
        
        return sb.toString();
    }
}