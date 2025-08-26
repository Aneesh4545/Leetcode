class Solution {
    public int areaOfMaxDiagonal(int[][] d) {
        int n=d.length;
        int maxarea=0,maxD=0;
        for(int i=0;i<n;i++){
            int l=d[i][0];
            int w=d[i][1];
            int c=l*l +w*w;
             if (c > maxD || (c == maxD && l * w > maxarea)) {
                maxD = c;
                maxarea = l * w;
            }
        }
        return maxarea;
    }
}