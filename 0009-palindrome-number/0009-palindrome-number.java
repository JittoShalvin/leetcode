class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false; 
        }
        int c=0;
        int d=x;
        while(x!=0){
            int a=x%10;
            c=c*10+a;
            x=x/10;
        }
        return c==d;
    }
}