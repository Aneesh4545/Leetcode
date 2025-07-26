class Solution {
    public int maxProfit(int[] p) {
        int b=Integer.MIN_VALUE;
        int s=0;
        for(int i=0;i<p.length;i++){
            s=Math.max(s,b+p[i]);
            b=Math.max(b,-p[i]);


        }
        return s;
    }
}