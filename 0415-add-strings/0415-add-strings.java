class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder re = new StringBuilder();
        int carry =0;
        int i = num1.length()-1;
        int j = num2.length()-1;

        while( i>=0 || j>=0 || carry>0){
            int sum = carry;
            if(i>=0){
                sum = sum +num1.charAt(i) -'0';
                i--;
            }
            if(j>=0){
                sum = sum +num2.charAt(j) - '0';
                j--;
            }
            re.append(sum%10);
            carry = sum /10;
        }
        return re.reverse().toString();
    }
}