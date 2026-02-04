class Solution {
    public int alternateDigitSum(int n) {
        n=pal(n);
        int b=0;

        while(n!=0){
            int a=n%10;
            b+=a;
            n/=10;
            int c=n%10;
            b-=c;
            n/=10;
        }
        return b;
    }
    public int pal(int a){
        int c=0;
        while(a!=0){
            int b=a%10;
            c=c*10+b;
            a=a/10;
        }
        return c;
    }
}