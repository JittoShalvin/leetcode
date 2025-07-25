class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        int a=0;
        int org=x;
        int temp=0;
        while(x!=0){
            a=(x%10)+(a*10);
            x=x/10;
        }
        return a==org;
    }
}