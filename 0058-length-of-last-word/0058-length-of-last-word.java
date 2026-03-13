class Solution {
    public int lengthOfLastWord(String s) {
        int a=0;
        String [] t=s.split("\\s+");

        return t[t.length-1].length();
    }
}