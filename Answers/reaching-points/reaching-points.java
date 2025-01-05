class Solution {
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        while (tx>sx && ty>sy){
            if(tx>ty)
                tx%=ty;
            else ty%= tx;
                
        }
        if(sx==tx && ty>=sy && (ty-sy)%sx ==0 ||   sy == ty && sx <= tx && (tx - sx) % sy == 0)
            return true;
        
        return false;
    }
}

// (x, x + y) or (x + y, y)
// 