import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger j = new BigInteger(num1);
        BigInteger k = new BigInteger(num2);
        BigInteger o=j.multiply(k);
        return o.toString();
        
    }
}