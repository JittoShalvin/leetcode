class Solution {
    public int getLucky(String s, int k) {
        int a=0;
        for(int i=0;i<s.length();i++){
            int b=s.charAt(i)-96;
            while(b!=0){
                int c=b%10;
                a=a+c;
                b=b/10;
            }
            
        }
        while(k>1){
            a=a(a);
            k--;
        }
        

        return a;
    }
        public int a(int a){
            int  c=0;
            while(a!=0){
                int b=a%10;
                c=c+b;
                a=a/10;
            }
            return c;
        }
  
}