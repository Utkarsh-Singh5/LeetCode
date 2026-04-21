import java.math.BigInteger;

class Solution {
    public String multiply(String n, String m) {
       
      BigInteger a = new BigInteger(n);
      BigInteger b = new BigInteger(m);
      BigInteger sum = a.multiply(b);
      return sum.toString();
        
    }
}