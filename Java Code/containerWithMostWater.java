class Solution {
    public int maxArea(int[] heights) {
        int rightPtr = heights.length - 1;
        int leftPtr = 0;
        int area = 0;
        while (leftPtr < rightPtr) {
            if (area < ((rightPtr - leftPtr) * Math.min(heights[leftPtr], heights[rightPtr]))) {
                area = ((rightPtr - leftPtr) * Math.min(heights[leftPtr], heights[rightPtr]));
            }
            if (heights[leftPtr] < heights[rightPtr]) {
                leftPtr++;
            } else {
                rightPtr--;
            }
        }
        return area;
    }
}
