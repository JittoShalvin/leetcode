class Solution {
    public String reverseVowels(String s) {
        char[] a=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(!a(a[i])){
                i++;
            }
            else if(!a(a[j])){
                j--;
            }
            else{
               char b= a[i];
               a[i]=a[j];
               a[j]=b;
               i++;
               j--;
            }
        }
        return new String(a);
    }
        public Boolean a(char a){
            if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U'){
                return true;
            }
            else return false;
        }
    
}