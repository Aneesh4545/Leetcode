class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // Step 1: Mark the index of each number as negative
        for (int n : nums) {
            int idx = Math.abs(n) - 1;
            if (nums[idx] > 0) {
                nums[idx] = -nums[idx];
            }
        }

        // Step 2: Collect all indexes that are still positive
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);  // missing number
            }
        }

        return result;
    }
}
