class Solution {
    public int lengthOfLastWord(String s) {
        String [] t=s.split("\\s+");
        return t[t.length-1].length();
    }
}