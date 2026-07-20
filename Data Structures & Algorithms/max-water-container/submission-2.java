class Solution {
    public int maxArea(int[] heights) {

        int s=0;
        int e=heights.length-1;

        int area=0;

        while(s<e){
            int res=Math.min(heights[s],heights[e])*(e-s);
            area=Math.max(res,area);
            if(heights[s]<heights[e]){
                s++;
            }else{
                e--;
            }
        }

        return area;       
    }
}
