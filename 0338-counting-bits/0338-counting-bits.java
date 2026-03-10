class Solution {
    public int[] countBits(int n) {
        int[] a=new int[n+1];
        int b=0;
        for(int i=0;i<a.length;i++){
            String c=Integer.toBinaryString(i);
             b=0;
            for(int j=0;j<c.length();j++){
                if(c.charAt(j)=='1'){
                    b+=1;
                }

            }
            a[i]=b;
        }
        return a;
    }
}