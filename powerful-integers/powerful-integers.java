class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        
        
        //generete all sequences of x 
        //then generate all sequences of y 
        
//         then run a doublw loop or some two pointer and make a list 
        
        List<Integer> xlist = new ArrayList();
        if(x==1) xlist.add(1);
        else{
        for (int xpower = 1 ; xpower <= bound-1 ; xpower = xpower * x ){
            
            xlist.add(xpower);    
        }}
        
        List<Integer> ylist = new ArrayList();
        if(y==1) ylist.add(1);
        else{
        for (int ypower = 1 ; ypower <= bound-1 ; ypower = ypower * y ){
            
            ylist.add(ypower);    
        }
        }
        Set<Integer> set = new HashSet();
        
        for (int i = 0 ; i< xlist.size() ; i++)
        {
            for (int j = 0 ;j< ylist.size();j++){
                
                int sum = xlist.get(i) + ylist.get(j);
                if(sum<=bound)
                    set.add(sum);
            }
        }
        List<Integer> ans = new ArrayList(set);
        return ans;
        
        
    }
}