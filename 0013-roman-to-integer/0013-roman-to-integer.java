class Solution {
    public int romanToInt(String c) {
        int ans =0;
        int[] aa = new int[128];
        aa['I']=1;
        aa['V']=5;
aa['X']=10;
aa['L']=50;
aa['C']=100;
aa['D']=500;
aa['M']=1000;

for(int i=0;i+1<c.length();i++){
    if(aa[c.charAt(i)]<aa[c.charAt(i+1)]){
        ans = ans-aa[c.charAt(i)];
    }else
    ans = ans+ aa[c.charAt(i)];
}
return ans+aa[c.charAt(c.length()-1)];



    }
}