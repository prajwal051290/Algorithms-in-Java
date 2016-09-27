/*Find the total area covered by two rectilinear rectangles in a 2D plane.

Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.

Assume that the total area is never beyond the maximum possible value of int.*/

/*
 * Logic:
 * When the two areas are overlapped, we only need to know the bottom left corner and top right corner of the overlapped area: 
 * the larger one of A and E, the larger one of B and F, the smaller one of C and G, and the smaller one of D and H
 */

public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int rect1Area = (C-A) * (D-B);
        int rect2Area = (G-E) * (H-F);
        
        int leftBottomX = Math.max(A,E);
        int leftBottomY = Math.max(B,F);
        int rightTopX = Math.min(C,G);
        int rightTopY = Math.min(D,H);
        
        int overlapArea = 0;
        
        if (rightTopX > leftBottomX && rightTopY > leftBottomY){
            overlapArea =  (rightTopX - leftBottomX) * (rightTopY - leftBottomY);
        }
        
        return rect1Area + rect2Area - overlapArea;
    }
}