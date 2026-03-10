class Solution {
    public int reverseBits(int n) {
        String a=Integer.toBinaryString(n);
        
        String b="";
        int d=32-a.length();
        for(int i=1;i<=d;i++){
            b=b+0;
        }
        for(int i=0;i<a.length();i++){
            b=a.charAt(i)+b;
        }
        int c=Integer.parseInt(b,2);
        return c;
    }
}