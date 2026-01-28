class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int a=0;
        int c=x;
        while(x!=0){
            int b=x%10;
            a=a*10+b;
            x=x/10;
        }
        return a==c;
    }
}