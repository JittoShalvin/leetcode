class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] a=s.toCharArray();
        char[] b=t.toCharArray();
        int j=0;
        for(int i=0;i<t.length()&&j<s.length();i++){
            if(a[j]==b[i] ){
                j++;
            }
        }
        return j==s.length();
    }
}