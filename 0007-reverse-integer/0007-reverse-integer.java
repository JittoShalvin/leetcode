class Solution {
    public int reverse(int x) {
        int temp=x;
        int res=0;
        while(temp!=0){
            res=(res*10)+temp%10;
            temp=temp/10;
        }
        return res;
    }
}