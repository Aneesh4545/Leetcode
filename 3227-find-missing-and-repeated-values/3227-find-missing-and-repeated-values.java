class Solution {
  public int[] findMissingAndRepeatedValues(int[][] grid) {
    int n = grid.length;
    int total = n * n;
    int[] count = new int[total + 1]; // Frequency array
    int repeat = 0, miss = 0;

    // Count each number in the grid
    for (int i = 0; i < n; i++) { // Loop through rows
      for (int j = 0; j < n; j++) { // Loop through columns
        int num = grid[i][j];
        count[num]++; // Increase frequency of this number
      }
    }

    // Find repeated and missing numbers
    for (int i = 1; i <= total; i++) {
      if (count[i] == 2) repeat = i; // Found repeated
      if (count[i] == 0) miss = i;   // Found missing
    }

    return new int[]{repeat, miss};
  }
}
