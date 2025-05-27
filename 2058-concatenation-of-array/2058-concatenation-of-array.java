class Solution {
    public int[] getConcatenation(int[] nums) {
      int[] res = new int[2*nums.length];
      for(int i=0;i<nums.length;i++){
        res[i]=nums[i];
      }
      int j=nums.length;
      for(int i=0;i<nums.length;i++){
        res[j]=nums[i];
        j++
      }
return res;
    }
}










        // int[] res = new int[2*nums.length];
        // for(int i=0;i<nums.length;i++){
        //     res[i]=nums[i];
        // }
        // int index = nums.length;
        // for(int i=0;i<nums.length;i++){
        //     res[index]=nums[i];
        //     index++;
        // }
        // return res;