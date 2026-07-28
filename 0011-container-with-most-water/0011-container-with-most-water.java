class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int  left = 0, right = height.length-1;
        while(left<right){
            int width = right-left;
            int minHieght = Math.min(height[left],height[right]);
             maxArea = Math.max(maxArea, width*minHieght);

            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }

        return maxArea;
        
    }
}