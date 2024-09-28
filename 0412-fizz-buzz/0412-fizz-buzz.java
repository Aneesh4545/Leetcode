class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans =new ArrayList<>();
        for(int i=1;i<=n;i++){
            StringBuilder s = new StringBuilder();
            if(i%3==0){
                s.append("Fizz");
            }
            if(i%5==0){
                s.append("Buzz");
            }
            ans.add(s.length() == 0 ? String.valueOf(i) : s.toString());

        }
        return ans;
    }
}