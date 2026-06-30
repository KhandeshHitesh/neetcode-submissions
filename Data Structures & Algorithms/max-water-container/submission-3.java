class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
int res=0;
        
        int i=0;
        int j=n-1;

        int water;

        while(i<j){

            if(heights[i]<=heights[j]){
                res=Math.max(res,(j-i)*heights[i]);
                i++;
            }
            else{
                res=Math.max(res,(j-i)*heights[j]);
                j--;
            }
        }

        return res;
    }
}
