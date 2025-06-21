class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        char[] a=s.toCharArray();
        while(i<j){
            if(!vowel(a[i])){
                i++;
            }
            else if(!vowel(a[j])){
                j--;
            }
            else{
                char temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
            }
        }
    return new String(a);
    }
    public boolean vowel(char ch){
        ch=Character.toLowerCase(ch);
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}