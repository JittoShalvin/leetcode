class Solution {
    public String reverseWords(String s) {
        
        String[] a=s.split("\\s+");
        String b="";
        for(int i=0;i<a.length;i++){
            b=a[i]+" "+b;
        }
        return b.trim();
    }
}