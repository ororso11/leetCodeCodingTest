import java.math.BigInteger;

public class lc21 {
    public static void main(String[] args) {
        BigInteger bigNumber1 = new BigInteger("123");
        BigInteger bigNumber2 = new BigInteger("12");
        System.out.println(bigNumber1.add(bigNumber2));
        String res = bigNumber1.add(bigNumber2).toString();
    }
}
