class Solution {
    public int[] buildArray(int[] nums) {
      int[] a = new int[nums.length];
      for(int i=0;i<nums.length;i++){
        a[i]=nums[nums[i]];
      }
      return a;
    }
}














//   int[] res = new int[nums.length];
//         for(int i=0; i<nums.length;i++){
//             res[i]=nums[nums[i]];
//         }
//         return res;