class Solution {
    public int addDigits(int num) {
        while(num/10!=0){
             num=a(num);
        }

        return num;
    }
        public int a(int a){
            int b=0;
            while(a!=0){
                int c=a%10;
                b=c+b;
                a=a/10;
            }
            return b;
        }
    
}