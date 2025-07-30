class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxx=0;
        for(int ic=0;ic<candies.length;ic++){
            if(candies[ic]>maxx){
                maxx=candies[ic];
            }
        }
        // Boolean[] res = new Boolean[candies.length];
ArrayList<Boolean> res = new ArrayList<>();
        for(int ic : candies){
            if(ic+extraCandies >=maxx){
                res.add(true);
            }else{
                res.add(false);
            }
        }
        return res;
    }
}