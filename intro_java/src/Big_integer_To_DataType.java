import java.math.BigInteger;

public class Big_integer_To_DataType {
    public static void main(String[] args) {
        int x =23;
        BigInteger y = new BigInteger(x+"");

        System.out.println(y);

        BigInteger a = new BigInteger("23299898993232");
        int b = a.intValue();
        System.out.println(b);
        long c= a.longValue();
        System.out.println(c);
    }
}
