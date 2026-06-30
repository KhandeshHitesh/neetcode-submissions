class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
int res=0;
        for (int i=0;i<n-1;i++){
            int water;
            for(int j=i+1;j<n;j++){
                water=(j-i)*(Math.min(heights[i],heights[j]));
                res=Math.max(res,water);
            }

        }
        return res;
    }
}
