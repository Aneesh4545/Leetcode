class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        int maxvow=0;
        int maxcon=0;
        for(char c:s.toCharArray()){
            int i=c-'a';
            freq[i]++;
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                maxvow=Math.max(maxvow, freq[i]);
            }else{
                maxcon=Math.max(maxcon, freq[i]);
            }
            
        }return maxvow+maxcon;
    }
}