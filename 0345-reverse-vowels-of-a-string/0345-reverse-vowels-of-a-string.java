class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j = s.length() - 1;
        char[] bh = s.toCharArray();  // move this outside the loop
            while(i<j){
            if (!isVowel(bh[i])) {
                i++;
            } else if (!isVowel(bh[j])) {
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
        private boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}