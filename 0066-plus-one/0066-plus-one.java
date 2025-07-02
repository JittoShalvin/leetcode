import java.math.BigInteger;
import java.util.Arrays;

class Solution {
    public int[] plusOne(int[] digits) {
        String s = Arrays.toString(digits).replaceAll("\\[|\\]|,|\\s", "");
        
        BigInteger number = new BigInteger(s);
        number = number.add(BigInteger.ONE); 
        
        String numStr = number.toString();
        int[] result = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            result[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return result;
    }
}
