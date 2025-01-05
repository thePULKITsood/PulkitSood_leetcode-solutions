class Solution {
    public int mirrorReflection(int p, int q) {
        while (p%2==0 && q%2 ==0){
            p/=2;
            q/=2;
            
        }
        if(q%2==0 && p%2 !=0){   // q=2; p=3
            return 0;
        }
        
        
        
        if(q%2 != 0 && p%2 ==0){   // q=1; p=2
            return 2;
        }
        
        
        if(q%2 != 0 && p%2 !=0){   // q=1; p=1
            return 1;
        }
        
        return -1;
    }
}
// both are odd 
// q is even p is odd 
// p is even and q is odd 

