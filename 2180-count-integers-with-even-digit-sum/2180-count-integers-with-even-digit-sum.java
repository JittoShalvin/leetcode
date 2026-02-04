class Solution {
    public int countEven(int num) {
        int a=0;
        for(int i=1;i<=num;i++){
            if(a(i)%2==0){
                a++;
            }
        }
        return a;
    }
    public int a(int a){
        int c=0;
        while(a!=0){
            int b=a%10;
            c+=b;
            a/=10;
        }
        return c;
    }
}