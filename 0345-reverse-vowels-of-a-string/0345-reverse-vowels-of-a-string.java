class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j = s.length() - 1;
        char[] bh = s.toCharArray();  
        while(i<j){
            if(!vowel(bh[i])){
                i++;
            }
            else if(!vowel(bh[j])){
                j--;
            }
            else{
                char temp=bh[i];
                bh[i]=bh[j];
                bh[j]=temp;
                i++;
                j--;
            }
        } 
        return new String(bh);
    }
    public boolean vowel(char ch){
        ch=Character.toLowerCase(ch);
        return ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    } 
}