class Solution {
    public String minRemoveToMakeValid(String s) {
        int open =0;
        char arr [] =s.toCharArray();
        for (int i=0;i<s.length();i++){
            if(arr[i]=='(')
                open++;
            
        if(arr[i]==')')
        {
            if(open==0)
                arr[i]=' ';
            else 
                open--;
        }
            
        }
        for (int i=s.length()-1;i>=0 && open >0 ;i--){
            if(arr[i]=='('){
                open--;
                arr[i]=' ';
            }
        }
        StringBuilder sb =new StringBuilder();
        
        for (int i=0;i<s.length();i++){
            if(arr[i]!=' ')
                sb.append(arr[i]);    
            }
        
    return sb.toString();
        
        
    }
}