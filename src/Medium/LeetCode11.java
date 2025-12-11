package Medium;

// Container with most water
// Time Complexity - O(n)
// Space Complexity - O(1)

public class LeetCode11 {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int maxArea = 0;

        while(l < r){
            int currArea = Math.min(height[l],height[r]) * (r - l);
            maxArea = Math.max(currArea,maxArea);

            if(height[l] <= height[r]) l++;
            else r--;
        }

        return maxArea;
    }
}
