class Solution {
    public int majorityElement(int[] nums) {
        int m=nums[0];
        int vote=1;
        for(int i=1;i<nums.length;i++){
            if(vote==0){
                vote++;
                m=nums[i];
            }else if(m==nums[i]){
                vote++;
            }else{
                vote--;
            }

        }
        return m;
    }
}