class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int x11 =rec1[0];
        int y11 =rec1[1];
        int x12 =rec1[2];
        int y12 =rec1[3];
        int x21 =rec2[0];
        int y21 =rec2[1];
        int x22 =rec2[2];
        int y22 =rec2[3];
        
        return (x11<x22 && y11 < y22 && x12>x21 && y12>y21);
    }
}