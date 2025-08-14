class Solution {
    public int[] searchRange(int[] nums, int t) {
        int[] ans ={-1,-1};
        ans[0]=search(nums,t,true);
        if(ans[0]!=-1){
            ans[1]=search(nums,t,false);
        }
    return ans;
    }

    int search(int[] nums, int t, boolean firststartindex){
        int ans=-1;
        int start=0;
        int end=nums.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if(t<nums[mid]){
                end=mid-1;
            }
            else if(t>nums[mid]){
                start=mid+1;
            }else{
                //potential ans found
                ans=mid;
                if(firststartindex){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}