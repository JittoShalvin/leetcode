class Solution {
    public boolean isHappy(int n) {
        HashSet <Integer> map=new HashSet<>();
        while(n!=1 && !map.contains(n)){
             map.add(n);
            n=a(n);
        }
        return n==1;
    }

        public int a(int a){
            int b=0;
            while(a!=0){
                int x=a%10;
                b=b+(int)Math.pow(x,2);
                a=a/10;
            }
            return b;
        }
    }